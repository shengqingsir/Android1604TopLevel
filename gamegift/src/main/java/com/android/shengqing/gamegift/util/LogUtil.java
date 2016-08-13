package com.android.shengqing.gamegift.util;

import android.util.Log;

/**
 * Created by sheng on 2016/8/13.
 */
public class LogUtil {
    private static final String TAG = "sheng";
    public static final boolean DEBUG = true;
    public static void log(Class clazz, String log) {
        /**
         * 封装log方法
         * DEBUG为true时执行log方法
         *      为false时不执行
         *
         * 目的：以后做项目时，不想打印日志，可以把DEBUG初始值设为false
         */
        if(DEBUG){
            Log.d(TAG, clazz.toString()+"<================>"+log);
        }
    }
}
