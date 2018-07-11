package com.virgo.pluto.test.fragment;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.virgo.pluto.R;

/**
 * 1、inflate attachToRoot false
 * 2、onAttach中将Context转成Activity，而不是直接使用getActivity
 * 3、对于activity，getSupportFragmentManager()获取FragmentActivity的FragmentManager对象
 * 对于fragment getFragmentManager()获取的是父fragment（如果没有，则是fragmentActivity）的fragmentManager对象
 * 而getChildFragmentManager()是获取自己的FragmentManager对象
 */
public class Fragment1 extends Fragment {

    public Fragment1() {

    }

    /**
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag1_layout, container, false);
        if (view.hashCode() % 3 == 0) {
            view.setBackgroundColor(Color.RED);
        } else if (view.hashCode() % 3 == 1) {
            view.setBackgroundColor(Color.GREEN);
        } else if (view.hashCode() % 3 == 2) {
            view.setBackgroundColor(Color.BLUE);
        }
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }
}
