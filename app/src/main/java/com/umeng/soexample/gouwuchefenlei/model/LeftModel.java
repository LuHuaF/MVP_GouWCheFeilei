package com.umeng.soexample.gouwuchefenlei.model;

import com.umeng.soexample.gouwuchefenlei.callback.ICallBack;
import com.umeng.soexample.gouwuchefenlei.utils.HttpUtils;

import java.lang.reflect.Type;


public class LeftModel {
    public void getlefts(String url, ICallBack callBack, Type type){
        HttpUtils.getInstance().get(url,callBack,type);
    }
}
