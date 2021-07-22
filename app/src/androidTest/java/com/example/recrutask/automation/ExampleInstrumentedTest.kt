package com.example.recrutask.automation

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.recrutask.MainActivity
import com.example.recrutask.automation.mainPage.MainPageActions
import com.example.recrutask.automation.movePage.MovePageActions
import com.example.recrutask.core.TestSetup
import dagger.hilt.android.testing.HiltAndroidTest

import org.junit.Test
import org.junit.Rule
import javax.inject.Inject

private const val DEFAULT = "Default"
private const val OKAY = "okay"

@HiltAndroidTest
class ExampleInstrumentedTest : TestSetup() {

    @get:Rule
    val activityRule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)

    @Inject
    lateinit var mainPageActions: MainPageActions
    @Inject
    lateinit var movePageActions: MovePageActions

    @Test
    fun testHopinNotDisplayedOnFirstCheckField() {
        mainPageActions.validatePasswordFieldText()
    }

    @Test
    fun testFirstToggleChangesLabelsTextOnTap() {
       mainPageActions.apply {
            clickOnFirstToggle()
            validateFirstToggleIsChecked()

            validateLabelsText(OKAY)

            clickOnFirstToggle()
            validateFirstToggleIsNotChecked()

            validateLabelsText(DEFAULT)
        }
    }

    @Test
    fun testSecondToggleChangesLabelsTextOnTap() {
        mainPageActions.apply {
            clickOnSecondToggle()
            validateSecondToggleIsChecked()

            validateLabelsText(OKAY)

            clickOnSecondToggle()
            validateSecondToggleIsNotChecked()

            validateLabelsText(DEFAULT)
        }
    }

    @Test
    fun testNewScreenDisplayedOnMoveButtonTap() {
        mainPageActions.clickOnMoveButton()
        movePageActions.validateMoveScreenDisplayed()
    }

    @Test
    fun testEditedTextDisplayedInNextPage() {
        val newPassword = "Hopin"

        mainPageActions.apply {
            enterTextInFirstCheckField(newPassword)
            clickOnMoveButton()
        }
        movePageActions.validateTextDisplayed(newPassword)
    }
}