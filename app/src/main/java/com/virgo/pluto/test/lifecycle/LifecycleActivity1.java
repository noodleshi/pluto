package com.virgo.pluto.test.lifecycle;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.virgo.pluto.log.NLog;
import com.virgo.pluto.test.viewmodel.UserModel;

public class LifecycleActivity1 extends AppCompatActivity{

    private static final String TAG = LifecycleActivity1.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        initLife();

        initViewmodel();
    }

    private void initLife() {
        getLifecycle().addObserver(new TLifecycleObserver());
        Lifecycle.State status = getLifecycle().getCurrentState();
    }

    private void initViewmodel() {


        UserModel userModel = ViewModelProviders.of(this).get(UserModel.class);


        userModel.getUserLiveData().observe(this, new Observer<UserModel.User>() {
            @Override
            public void onChanged(@Nullable UserModel.User user) {
                NLog.d(TAG, "onChange");
            }
        });

        userModel.setUser(new UserModel.User("noodle"));

    }
}
