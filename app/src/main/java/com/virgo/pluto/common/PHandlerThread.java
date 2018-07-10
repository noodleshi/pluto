package com.virgo.pluto.common;

import android.app.Activity;
import android.os.HandlerThread;

public class PHandlerThread extends HandlerThread {
    private static final String TAG = PHandlerThread.class.getSimpleName();

    public PHandlerThread(Activity activity) {
        this("phandlerThread");
    }

    public PHandlerThread(String name) {
        super(name);
    }

}
