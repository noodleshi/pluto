package com.virgo.pluto.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.virgo.pluto.base.BaseActivity;
import com.virgo.pluto.common.PHandlerThread;
import com.virgo.pluto.fragment.HeadlessFragment;

public class TestActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addHeadlessFragment(new HeadlessFragment());
        addHeadlessFragment(new HeadlessFragment());

        PHandlerThread thread = new PHandlerThread(this);
        thread.start();

        addPFragment(new TestFragment());
    }
}
