package com.virgo.pluto.test.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import java.util.List;

/**
 * 使用FragmentPagerAdapter，ViewPager中所有的Fragment实例长驻内存，当fragment变的不可见时仅仅是视图结构销毁，
 * 即调用了onDestroyView方法，由于FragmentPagerAdapter内存消耗较大，适合少量静态页面
 *
 * FragmentStatePagerAdapter，fragment不可见，不仅视图销毁，实例也销毁，调用onDestroyView和onDestroy方法，仅仅保存fragment状态
 */
public class FragmentPagerAdapter1 extends android.support.v4.app.FragmentPagerAdapter {

    private FragmentManager fragmentManager;
    private List<Fragment> fragmentList;

    public FragmentPagerAdapter1(FragmentManager fm, List<Fragment> flist) {
        super(fm);
        fragmentManager = fm;
        fragmentList = flist;
    }

    public FragmentPagerAdapter1(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
