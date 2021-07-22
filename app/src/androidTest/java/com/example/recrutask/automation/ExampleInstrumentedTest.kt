package com.example.recrutask.automation

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.recrutask.MainActivity
import com.example.recrutask.R
import com.example.recrutask.core.TestSetup
import org.hamcrest.CoreMatchers.not

import org.junit.Test
import org.junit.Rule

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
}