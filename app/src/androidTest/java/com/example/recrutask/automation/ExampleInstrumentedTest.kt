package com.example.recrutask.automation

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.recrutask.MainActivity
import com.example.recrutask.R
import com.example.recrutask.core.TestSetup
import org.hamcrest.CoreMatchers.not

import org.junit.Test
import org.junit.Rule

private const val DEFAULT = "Default"
private const val OKAY = "okay"

class ExampleInstrumentedTest : TestSetup() {

    @get:Rule
    val activityRule: ActivityScenarioRule<MainActivity>
            = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testHopinNotDisplayedOnFirstCheckField() {
        val passwordNotExpected = "Hopin"
        val firstCheckPasswordField = withId(R.id.editTextTextPassword)

        onView(firstCheckPasswordField).check(matches(not(withText(passwordNotExpected))))
    }

    @Test
    fun testFirstToggleChangesLabelsTextOnTap() {
        val firstToggle = withId(R.id.toggleButton)
        val firstLabel = withId(R.id.textView3)
        val secondLabel = withId(R.id.textView4)

        onView(firstToggle).perform(click())
        onView(firstToggle).check(matches(isChecked()))

        onView(firstLabel).check(matches(withText(OKAY)))
        onView(secondLabel).check(matches(withText(OKAY)))

        onView(firstToggle).perform(click())
        onView(firstToggle).check(matches(not(isChecked())))

        onView(firstLabel).check(matches(withText(DEFAULT)))
        onView(secondLabel).check(matches(withText(DEFAULT)))
    }

    @Test
    fun testSecondToggleChangesLabelsTextOnTap() {
        val secondToggle = withId(R.id.toggleButton2)
        val firstLabel = withId(R.id.textView3)
        val secondLabel = withId(R.id.textView4)

        onView(secondToggle).perform(click())
        onView(secondToggle).check(matches(isChecked()))

        onView(firstLabel).check(matches(withText(OKAY)))
        onView(secondLabel).check(matches(withText(OKAY)))

        onView(secondToggle).perform(click())
        onView(secondToggle).check(matches(not(isChecked())))

        onView(firstLabel).check(matches(withText(DEFAULT)))
        onView(secondLabel).check(matches(withText(DEFAULT)))
    }
}