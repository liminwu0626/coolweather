package com.whty.coolweather.application;

import android.app.Application;
import android.content.Context;

import com.socks.library.KLog;

import org.litepal.LitePal;

/**
 * Created by wulimin on 2016/12/25.
 */

public class MyApplication extends Application {
    private static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();
        KLog.init(true, "酷欧天气");
        LitePal.initialize(this);
    }

    public static Context getContext() {
        return sContext;
    }
}
