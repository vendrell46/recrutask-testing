package com.example.recrutask.core

import androidx.test.platform.app.InstrumentationRegistry
import dagger.hilt.android.testing.HiltAndroidRule
import org.junit.Assert
import org.junit.Before
import org.junit.Rule

open class TestSetup {

    @get:Rule
    val hiltRule = HiltAndroidRule(this)

    @Before
    fun setUp() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        Assert.assertEquals("com.example.recrutask", appContext.packageName)
        hiltRule.inject()
    }
}