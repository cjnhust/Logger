package me.chubbyhust.logger;

import android.util.Log;

/**
 * Created by yitaidiannao on 2016/3/27.
 */
public class Logger {

    private static boolean enabled = false;

    public static String setTag() {
        StackTraceElement caller = new Throwable().fillInStackTrace().getStackTrace()[2];
        return new StringBuilder()
                .append(caller.getClassName())
                .append(".")
                .append(caller.getMethodName())
                .append("()")
                .append("in Line")
                .append(caller.getLineNumber())
                .toString();
    }



    public static boolean isEnabled() {
        return enabled;
    }

    public static void setEnabled(boolean enabled) {
        Logger.enabled = enabled;
    }

    public static void v(String content){
        if (!enabled) {return;}
        String tag = setTag();
        Log.v(tag, content);
    }

    public static void d(String content){
        if (!enabled) {return;}
        String tag = setTag();
        Log.d(tag, content);
    }

    public static void i(String content){
        if (!enabled) {return;}
        String tag = setTag();
        Log.i(tag, content);
    }

    public static void w(String content){
        if (!enabled) {return;}
        String tag = setTag();
        Log.w(tag, content);
    }

    public static void e(String content){
        if (!enabled) {return;}
        String tag = setTag();
        Log.e(tag, content);
    }



}
