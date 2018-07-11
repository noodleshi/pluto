package com.virgo.pluto.test.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.virgo.pluto.test.network.NetReq;

public class ReqViewModel extends ViewModel {

    public MutableLiveData<ReqObject> reqData = new MutableLiveData<>();


    public void req() {
        NetReq.req(new NetReq.ReqCallBack() {
            @Override
            public void suc() {
                ReqObject object = new ReqObject();

                reqData.setValue(object);
            }

            @Override
            public void error() {

            }
        });
    }

    public class ReqObject {
        public int id;
    }
}
