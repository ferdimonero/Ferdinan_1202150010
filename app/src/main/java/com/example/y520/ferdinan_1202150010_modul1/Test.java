package com.example.y520.ferdinan_1202150010_modul1;

import android.content.Context;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Y520 on 2/4/2018.
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.y520.ferdinan_1202150010_modul1", appContext.getPackageName());
    }
}