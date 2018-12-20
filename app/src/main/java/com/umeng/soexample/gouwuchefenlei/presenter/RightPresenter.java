package com.umeng.soexample.gouwuchefenlei.presenter;




import com.google.gson.reflect.TypeToken;
import com.umeng.soexample.gouwuchefenlei.bean.RightBean;
import com.umeng.soexample.gouwuchefenlei.callback.ICallBack;
import com.umeng.soexample.gouwuchefenlei.model.RightModel;
import com.umeng.soexample.gouwuchefenlei.view.RightView;

import java.lang.reflect.Type;



public class RightPresenter {
    private RightView iv;
    private RightModel rightModel;
    public void attch(RightView iv){
        this.iv = iv;
        rightModel = new RightModel();
    }
    public void getright(String url){
        Type type = new TypeToken<RightBean>(){}.getType();
        rightModel.getrights(url, new ICallBack() {
            @Override
            public void onSuccess(Object obj) {
                RightBean rightBean = (RightBean) obj;
                if (rightBean!=null){
                    iv.getrights(rightBean.getData());
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
