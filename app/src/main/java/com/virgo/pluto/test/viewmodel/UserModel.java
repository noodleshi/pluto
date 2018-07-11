package com.virgo.pluto.test.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.virgo.pluto.log.NLog;

public class UserModel extends ViewModel{

    private static final String TAG = UserModel.class.getSimpleName();

    public MutableLiveData<User> userLiveData = new MutableLiveData<>();

    public User getUser() {
        return userLiveData.getValue();
    }

    public void setUser(User user) {
        userLiveData.setValue(user);
    }

    public MutableLiveData<User> getUserLiveData() {
        return userLiveData;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        userLiveData = null;
    }

    public static class User {
        String name;
        public User(String n) {
            name = n;
        }
    }

    public static class MyFragment extends Fragment {

        @Override
        public void onStart() {
            super.onStart();

            UserModel userModel = ViewModelProviders.of(getActivity()).get(UserModel.class);
            userModel.setUser(new User("noodle"));

            userModel.getUserLiveData().observe(this, new Observer<User>() {
                @Override
                public void onChanged(@Nullable User user) {
                    NLog.d(TAG, "onChange");
                }
            });
        }
    }
}
