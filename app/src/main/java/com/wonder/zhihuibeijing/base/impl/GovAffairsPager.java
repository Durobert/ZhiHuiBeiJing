package com.wonder.zhihuibeijing.base.impl;

import android.app.Activity;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;

import com.wonder.zhihuibeijing.base.BasePager;

/**
 * Created by 13036 on 2016/6/10.
 */
public class GovAffairsPager extends BasePager{
    public GovAffairsPager(Activity activity) {
        super(activity);
    }

    @Override
    public void initData() {
        TextView view = new TextView(mActivity);
        view.setText("政务");
        view.setTextColor(Color.RED);
        view.setTextSize(22);
        view.setGravity(Gravity.CENTER);
        flContent.addView(view);
        tvTitle.setText("政务");
    }
}