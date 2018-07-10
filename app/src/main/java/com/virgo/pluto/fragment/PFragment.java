package com.virgo.pluto.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.virgo.pluto.log.NLog;

public class PFragment extends BaseFragment {
    private static final String TAG = PFragment.class.getSimpleName();

    private int frag_id;

    public String getFragTag() {
        return "pfrag#" + (frag_id);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        frag_id++;
        NLog.d(TAG, "onCreate");
    }

    @Override
    public void onResume() {
        super.onResume();
        NLog.d(TAG, "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        NLog.d(TAG, "onPause");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        NLog.d(TAG, "onDestroy");
    }

    @Override
    public PFragment setCallback(Callback callback) {
        mCb = callback;
        return this;
    }
}
