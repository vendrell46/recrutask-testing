package com.example.recrutask.automation.mainPage

import com.example.recrutask.utils.*
import com.example.recrutask.utils.assertIsChecked
import javax.inject.Inject

class MainPageActions @Inject constructor(
    private val mainPageElements: MainPageElements
) {

    fun clickOnFirstToggle() {
        clickOn(mainPageElements.firstToggle)
    }

    fun clickOnSecondToggle() {
        clickOn(mainPageElements.secondToggle)
    }

    fun clickOnMoveButton() {
        clickOn(mainPageElements.moveBtn)
    }

    fun enterTextInFirstCheckField(newText: String) {
        mainPageElements.firstCheckPasswordField.apply {
            clearTextFrom(this)
            typeTextOn(this, newText)
        }
    }

    fun validateFirstToggleIsChecked() {
        assertIsChecked(mainPageElements.firstToggle)
    }

    fun validateFirstToggleIsNotChecked() {
        assertIsNotChecked(mainPageElements.firstToggle)
    }

    fun validateSecondToggleIsChecked() {
        assertIsChecked(mainPageElements.secondToggle)
    }

    fun validateSecondToggleIsNotChecked() {
        assertIsNotChecked(mainPageElements.secondToggle)
    }

    fun validatePasswordFieldText() {
        val passwordNotExpected = "Hopin"
        assertElementHasNoTextDisplayed(mainPageElements.firstCheckPasswordField, passwordNotExpected)
    }

    fun validateLabelsText(text: String) {
        mainPageElements.apply {
            assertElementHasTextDisplayed(firstLabel, text)
            assertElementHasTextDisplayed(secondLabel, text)
        }
    }
}