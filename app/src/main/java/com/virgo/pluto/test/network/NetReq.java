package com.virgo.pluto.test.network;


import android.os.Handler;
import android.os.Looper;

public class NetReq{

    public static void req(final ReqCallBack t) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                t.suc();
            }
        }, 2000);
    }

    public static interface ReqCallBack{

        void suc();
        void error();
    }
}
