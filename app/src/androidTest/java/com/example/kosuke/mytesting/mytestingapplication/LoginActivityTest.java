package com.example.kosuke.mytesting.mytestingapplication;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by komiyakosuke on 2/6/2018 AD.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class LoginActivityTest {

    @Rule
    public ActivityTestRule<LoginActivity> activityTestRule = new ActivityTestRule(LoginActivity.class);

    @Test
    public void listGoesOverTheFold() {
//        Espresso.onView(ViewMatchers.withText("Hello world!")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        Espresso.onView(ViewMatchers.withId(R.id.email))
                .perform(ViewActions.typeText("hello@example.com"));
        Espresso.onView(ViewMatchers.withId(R.id.password))
                .perform(ViewActions.typeText("password"));

        Espresso.onView(ViewMatchers.withId(R.id.email_sign_in_button)).perform(ViewActions.click());

        // Check a different activity.
        Espresso.onView(ViewMatchers.withId(R.id.hello)).check(ViewAssertions.matches(ViewMatchers.withText("Hello my app")));
    }
}
