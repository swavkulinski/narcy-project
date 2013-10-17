package com.robotoaster.narcy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;

import static org.junit.Assert.*;

/**
 * - has list fragment
 * - refresh list every 2sec
 */
@RunWith(RobolectricGradleTestRunner.class)
public class MainActivityTest {

    @Test
    public void passMe() {
        MainActivity activity = Robolectric.buildActivity(MainActivity.class).create().resume().get();
        assertNotNull(activity);
        assertNotNull(activity.getString(R.string.hello_world));
    }
    @Test
    public void hasListFragment () {
	fail("ni!");
    }
    @Test
    public void runsRefreshEvery2sec() {
	fail("ni!");
    }
}
