package com.virgo.pluto.common;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/**
 * 1、activity生命周期之外的view使用applicationContext
 * 2、context数量=activity数量+service数量+1
 */
public class PContextContext {

    /**
     * getActivity
     * ContextWrapper属于包装类,真正的contet是getBaseContext()
     *
     * @param context
     * @return
     */
    public static Activity getActivity(Context context) {
//        http://stackoverflow.com/questions/37196284/android-support-library-23-4-0-android-support-v7-widget-tintcontextwrapper-can
//        http://stackoverflow.com/questions/8276634/android-get-hosting-activity-from-a-view/32973351#32973351
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
