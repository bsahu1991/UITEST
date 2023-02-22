package com.vicky.itconvtest

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.activityScenarioRule
import com.vicky.itconvtest.view.ViewPostActivity
import com.vicky.itconvtest.view.adapter.ViewHolder
import org.junit.Rule
import org.junit.Test

class ViewPostActivityTest {
    @get:Rule
    val activityScenarioRule = activityScenarioRule<ViewPostActivity>()
    val targetContext: Context = ApplicationProvider.getApplicationContext()
    val LIST_ITEM_IN_TEST = 4

    @Test
    fun test_isRecyclerViewVisible() {
        onView(withId(R.id.rvData))
            .check(matches(isDisplayed()))
    }

    @Test
    fun test_recyclerViewClick() {
     targetContext as TestApplication

        onView(withId(R.id.rvData)).perform(
            actionOnItemAtPosition<ViewHolder>(
                LIST_ITEM_IN_TEST,
                click()
            )
        )

        onView(withId(R.id.tvDetailTitle)).check(matches(withText(targetContext.getList()[LIST_ITEM_IN_TEST].title)))

    }

    @Test
    fun test_recyclerViewClickAndBackPress() {

        onView(withId(R.id.rvData)).perform(
            actionOnItemAtPosition<ViewHolder>(
                LIST_ITEM_IN_TEST,
                click()
            )
        )

        pressBack()
        onView(withId(R.id.rvData))
            .check(matches(isDisplayed()))

    }



}


