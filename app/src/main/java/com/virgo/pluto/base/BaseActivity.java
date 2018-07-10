package com.virgo.pluto.base;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.virgo.pluto.fragment.HeadlessFragment;
import com.virgo.pluto.fragment.PFragment;

public class BaseActivity extends AppCompatActivity {

    private static final String FRAG_TAG = "headless_fragment";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void addPFragment(PFragment fragment) {
        // 监听activity 生命周期
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(fragment, fragment.getTag());
        transaction.commit();
    }


    public void addHeadlessFragment(HeadlessFragment fragment) {
        // 监听activity 生命周期
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(fragment, FRAG_TAG);
        transaction.commit();

        // 监听fragment 生命周期
//        Fragment frag = null;
//        FragmentTransaction fragTrans = frag.getChildFragmentManager().beginTransaction();
//        fragTrans.add(fragment, FRAG_TAG);
//        fragTrans.commit();
    }
}
