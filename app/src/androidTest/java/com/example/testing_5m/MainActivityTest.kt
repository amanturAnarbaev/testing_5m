package com.example.testing_5m

import android.app.Activity
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @Rule
    @JvmField
    val rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleAdd() {
        runBlocking {

            Espresso.onView(withId(R.id.firstN)).perform(ViewActions.typeText("5"))
            delay(3000)
            Espresso.onView(withId(R.id.secondN)).perform(ViewActions.typeText("5"))
            delay(3000)
            Espresso.onView(withId(R.id.click)).perform(ViewActions.click())
            delay(3000)
            Espresso.onView(withId(R.id.result))
                .check(ViewAssertions.matches(ViewMatchers.withText("10")))

        }

    }

}