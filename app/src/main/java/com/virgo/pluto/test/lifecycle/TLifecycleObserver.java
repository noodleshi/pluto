package com.virgo.pluto.test.lifecycle;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;

import com.virgo.pluto.log.NLog;

public class TLifecycleObserver implements LifecycleObserver {

    private static final String TAG = TLifecycleObserver.class.getSimpleName();

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void onCreate() {
        NLog.d(TAG, "onCreate");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void onResume() {
        NLog.d(TAG, "onResume");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void onPause() {
        NLog.d(TAG, "onPause");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestroy() {
        NLog.d(TAG, "onDestroy");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void start() {
    }
}
