package com.vicky.itconvtest

import android.content.ComponentName
import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.activityScenarioRule
import com.vicky.itconvtest.view.MainActivity
import com.vicky.itconvtest.view.ViewPostActivity
import org.junit.Rule
import org.junit.Test


class MainActivityTest {

    @get:Rule
    val activityScenarioRule = activityScenarioRule<MainActivity>()

    val targetContext: Context = ApplicationProvider.getApplicationContext()
    private fun getResourceString(id: Int): String {
        return targetContext.resources.getString(id)
    }

    @Test
    fun testViewButton_expectedCorrectText(){
        //onView(withId(R.id.btn_view)).perform(click())
        onView(withId(R.id.btn_view)).check(matches(withText(getResourceString(R.string.view_post))))
    }

    @Test
    fun testAddButton_expectedCorrectText(){
        onView(withId(R.id.btn_post)).check(matches(withText("Add Post")))
    }

    @Test
    fun testViewButton_expectedViewPost(){
        Intents.init()
        onView(withId(R.id.btn_view)).perform(click())
        intended(hasComponent(ComponentName(targetContext,ViewPostActivity::class.java)))

    }
}