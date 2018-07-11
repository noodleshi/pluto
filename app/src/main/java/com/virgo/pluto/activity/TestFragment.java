package com.virgo.pluto.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.virgo.pluto.R;
import com.virgo.pluto.fragment.PFragment;
import com.virgo.pluto.test.lifecycle.LifecycleActivity1;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class TestFragment extends PFragment {

    @BindView(R.id.viewmodel)
    Button viewmodel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getActivity() != null) {
            getActivity().setContentView(R.layout.activity_test);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, getActivity());

        viewmodel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent();
                it.setClass(getActivity(), LifecycleActivity1.class);
                getActivity().startActivity(it);
            }
        });
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
