package com.virgo.pluto.log;

import android.util.Log;

public class NLog {
    public static void d(String tag, String msg) {
        Log.d(tag, msg);
    }

    public static void e(String tag, String msg) {
        Log.e(tag, msg);
    }
}
