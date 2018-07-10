package com.virgo.pluto.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.virgo.pluto.R;
import com.virgo.pluto.fragment.PFragment;

public class TestFragment extends PFragment{

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getActivity() != null) {
            getActivity().setContentView(R.layout.activity_test);
        }
    }
}
