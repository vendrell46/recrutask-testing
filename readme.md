# QE Live Espresso automation task
Sample Android application written in Kotlin.

## What has been done
* I cloned the app and I had to update versions in build.gradle files in order for AS to build successfully.
* Once I launched the app I did some exploratory testing to learn how the app works and to find what doesn't work.
* After reading the 'acceptance criteria' of what was expected behaviour for the buttons I understood that both buttons had the same function of modifying the label   always after every tap. That's when I noticed that the second button was not working accordingly. That's why I went to MainActivity code to see what was happening   there and I saw an easy fix to make both buttons work the same way as per AC. Hence I fixed the bug and pushed it.
* Straight after that I implemented all UI test cases to make sure everything works, leaving refactoring for later stage.
* For the sake of avoiding static functions in the framework I have set up Hilt Android as my Dependency Injection framework.
* Then, I moved variables that define elements of the UI to specific classes for Elements and likewise for interactions on UI moving them to Actions classes.
* And to finalize I created Assertions and Interactions wrappers in order to make the code re-usable and more readable.



## Test cases (Acceptance Criteria)
1. Check if text in First check field is different than Hopin.
2. Check if toogles are working correctly. They should set textView “okay” on change and return to default value on the next tap.
3. Check if new activity is launched after click button MOVE.
4. Text view in next activity is based on First check field. Set there a text “Hopin” and confirm if everything is working.
