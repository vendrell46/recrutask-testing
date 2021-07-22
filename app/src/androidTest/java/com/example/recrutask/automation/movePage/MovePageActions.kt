package com.example.recrutask.automation.movePage

import com.example.recrutask.utils.assertDisplayed
import com.example.recrutask.utils.assertElementHasTextDisplayed
import javax.inject.Inject

class MovePageActions @Inject constructor(
    private val movePageElements: MovePageElements
) {

    fun validateMoveScreenDisplayed() {
        assertDisplayed(movePageElements.moveScreenText)
    }

    fun validateTextDisplayed(text: String) {
        assertElementHasTextDisplayed(movePageElements.moveScreenText, text)
    }
}