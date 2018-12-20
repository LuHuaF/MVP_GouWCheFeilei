package com.umeng.soexample.gouwuchefenlei.presenter;

import com.google.gson.reflect.TypeToken;
import com.umeng.soexample.gouwuchefenlei.bean.LeftBean;
import com.umeng.soexample.gouwuchefenlei.callback.ICallBack;
import com.umeng.soexample.gouwuchefenlei.model.LeftModel;
import com.umeng.soexample.gouwuchefenlei.view.IView;

import java.lang.reflect.Type;
import java.net.URL;



public class LeftPresenter {
    private IView iv;
    private LeftModel leftModel;
    public void attch(final IView iv){
        this.iv = iv;
        leftModel = new LeftModel();
    }
    public void getleft(){
        Type type = new TypeToken<LeftBean>(){}.getType();
        leftModel.getlefts("http://www.zhaoapi.cn/product/getCatagory", new ICallBack() {
            @Override
            public void onSuccess(Object obj) {
                LeftBean leftBean = (LeftBean) obj;
                if (leftBean!=null){
                    iv.getleft(leftBean.getData());
                }
            }

            @Override
            public void onFailed(Exception e) {
                iv.failed(e);
            }
        },type);
    }
    public void detach(){
        if (iv !=null){
            iv = null;
        }
    }
}
