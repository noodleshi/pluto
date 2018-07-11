package com.virgo.pluto.test.fragment;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.virgo.pluto.R;
import com.virgo.pluto.log.NLog;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 1、add() remove() replace() 一次事务，可以同时add remove replace
 * 2、commit是异步操作，同步方法commitNow
 * 3、addToBackStace("fname") 可选，FragmentManager拥有回退栈（add(frag1), 回退操作就是remove(frag1)）
 * 4、fragment重叠问题，fragment被系统杀掉，重新初始化时再次将fragment加入activity
 * <p>
 * 1、commit在onSaveInstanceState后调用，会抛异常。
 * 2、不用讲fragment事务放在异步线程回掉
 */
public class FragmentActivity1 extends AppCompatActivity {

    private static final String TAG = FragmentActivity1.class.getSimpleName();
    @BindView(R.id.frag_container)
    FrameLayout fragContainer;
    @BindView(R.id.viewpager)
    ViewPager viewpager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag1);
        ButterKnife.bind(this);

        fragTest();

        initViewPager();
    }

    private void fragTest() {

//        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//        transaction.add(R.id.frag_container, new Fragment1(), "f1");
//        transaction.addToBackStack("f1");
//
//        transaction.add(R.id.frag_container, new Fragment1(), "f2");
//        transaction.addToBackStack("f2");
//        transaction.commit();


        Fragment fragment = getSupportFragmentManager().findFragmentByTag("f1");
    }

    private void initViewPager() {
        List list = new ArrayList();
        list.add(new Fragment1());
        list.add(new Fragment1());

        list.add(new Fragment1());
        list.add(new Fragment1());
        list.add(new Fragment1());

        FragmentPagerAdapter1 adapter1 = new FragmentPagerAdapter1(getSupportFragmentManager(), list);
        viewpager.setAdapter(adapter1);
        viewpager.setCurrentItem(0);

        viewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                NLog.d(TAG, "page select " + position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        NLog.d(TAG, "onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        NLog.d(TAG, "onRestoreInstanceState");
    }
}
