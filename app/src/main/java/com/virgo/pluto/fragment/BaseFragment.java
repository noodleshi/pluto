package com.virgo.pluto.fragment;

import android.app.Fragment;

public abstract class BaseFragment extends Fragment {
    public static int FRAG_TAG_ID = 0;

    protected BaseFragment.Callback mCb;

    public abstract BaseFragment setCallback(Callback callback);


    public static abstract class DestroyCallback implements BaseFragment.Callback {

        @Override
        public void onCreate() {

        }

        @Override
        public void onResume() {

        }

        @Override
        public void onPause() {

        }

        public abstract void onDestroy();
    }

    public static abstract class CreateCallback implements BaseFragment.Callback {

        public abstract void onCreate();

        @Override
        public void onResume() {

        }

        @Override
        public void onPause() {

        }

        @Override
        public void onDestroy() {

        }
    }

    public static abstract class PauseCallback implements BaseFragment.Callback {


        @Override
        public void onCreate() {

        }

        @Override
        public void onResume() {

        }

        public abstract void onPause();

        @Override
        public void onDestroy() {

        }
    }

    public static abstract class ResumeCallback implements BaseFragment.Callback {

        @Override
        public void onCreate() {

        }

        public abstract void onResume();

        @Override
        public void onPause() {

        }

        @Override
        public void onDestroy() {

        }
    }

    public class EmptyCallback implements Callback{

        @Override
        public void onCreate() {

        }

        @Override
        public void onResume() {

        }

        @Override
        public void onPause() {

        }

        @Override
        public void onDestroy() {

        }
    }

    public interface Callback {
        void onCreate();

        void onResume();

        void onPause();

        void onDestroy();
    }

}
