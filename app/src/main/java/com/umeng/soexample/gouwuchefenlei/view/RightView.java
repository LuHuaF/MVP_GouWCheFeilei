package com.umeng.soexample.gouwuchefenlei.view;


import com.umeng.soexample.gouwuchefenlei.bean.RightBean;

import java.util.List;

public interface RightView {
    void getrights(List<RightBean.DataBean> list);
    void failed(Exception e);
}
