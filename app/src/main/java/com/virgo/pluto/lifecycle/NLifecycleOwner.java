package com.virgo.pluto.lifecycle;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.support.annotation.NonNull;

public class NLifecycleOwner implements LifecycleOwner {
    @NonNull
    @Override
    public Lifecycle getLifecycle() {
        return null;
    }
}
