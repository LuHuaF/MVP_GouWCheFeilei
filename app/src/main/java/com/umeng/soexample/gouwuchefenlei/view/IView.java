package com.umeng.soexample.gouwuchefenlei.view;


import com.umeng.soexample.gouwuchefenlei.bean.LeftBean;

import java.util.List;

public interface IView {
    void getleft(List<LeftBean.DataBean> list);
    void failed(Exception e);
}
