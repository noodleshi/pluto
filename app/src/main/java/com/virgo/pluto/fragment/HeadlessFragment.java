package com.virgo.pluto.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.virgo.pluto.log.NLog;

/**
 * 替代BaseActivity
 * 1、A逻辑封装到AFragment, B逻辑封装到BFragment，activity按需添加对应的fragmnet
 * 2、监听网络变化，请求运行时权限
 * 3、rxlifecycle rxpermission都是用fragment
 * 4、处理与生命周期有关的异步任务，service的另一种选择
 */
public class HeadlessFragment extends BaseFragment {

    private static final String TAG = HeadlessFragment.class.getSimpleName();

    private int frag_id;

    public String getFragTag() {

        return "headlessfrag#" + (frag_id);
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
    public HeadlessFragment setCallback(Callback callback) {
        mCb = callback;
        return this;
    }
}
