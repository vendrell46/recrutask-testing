package com.example.recrutask.utils

import androidx.annotation.IdRes
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.hamcrest.CoreMatchers.not

fun assertDisplayed(@IdRes id: Int) {
    onView(withId(id)).check(matches(isDisplayed()))
}

fun assertIsChecked(@IdRes id: Int) {
    onView(withId(id)).check(matches(isChecked()))
}

fun assertIsNotChecked(@IdRes id: Int) {
    onView(withId(id)).check(matches(not(isChecked())))
}

fun assertElementHasNoTextDisplayed(@IdRes id: Int, text: String) {
    onView(withId(id)).check(matches(not(withText(text))))
}

fun assertElementHasTextDisplayed(@IdRes id: Int, text: String) {
    onView(withId(id)).check(matches(withText(text)))
}