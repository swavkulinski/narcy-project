package com.robotoaster.narcy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;

import static org.junit.Assert.*;

/**
 * Created by swav on 12/10/13.
 */
@RunWith(RobolectricGradleTestRunner.class)
public class MainActivityTest {

    @Test
    public void passMe() {
        MainActivity activity = Robolectric.buildActivity(MainActivity.class).create().resume().get();
        assertNotNull(activity);
        assertNotNull(activity.getString(R.string.hello_world));
    }
}
