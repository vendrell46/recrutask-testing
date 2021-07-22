package com.example.recrutask.core

import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert
import org.junit.Before

open class TestSetup {

    @Before
    fun setUp() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        Assert.assertEquals("com.example.recrutask", appContext.packageName)
    }
}