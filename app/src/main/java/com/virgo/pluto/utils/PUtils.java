package com.virgo.pluto.utils;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.text.format.DateUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/**
 * 工具类
 * 1、ThumbnailUtils
 *     createVideoThumnail(String filePath, int kind)
 *     extractThumbnail(Bitmap source, int width, int height)
 *
 * 2、ArgbEvaluator
 *     提供两个其实色值和一个分值，特定算法计算新的颜色中间值
 *     自定义属性动画求值器，根据时间改变view的显示状态
 *     配合viewpager提供滑动偏离值使用，其背景色随着滑动动态改变
 */
public class PUtils {

    /**
     * 动态获取资源
     * 一个完整的资源名 package:type/entry 对应资源名称，资源类型，应用包名
     *
     * @param context
     * @param name
     * @param type
     * @return
     */
    public static int getIdentifier(Context context, String name, String type) {
        return context.getResources().getIdentifier(name, type, context.getPackageName());
    }

    public static Spanned fromHtml(String html) {
        return Html.fromHtml(html);
    }

    /**
     * FORMAT_SHOW_DATE
     * FORMAT_SHOW_TIME
     * FORMAT_SHOW_WEEKDAY
     * FORMAT_SHOW_YEAR
     *
     * @param context
     * @param millis
     * @param flags
     * @return
     */
    public static String fromtDateTime(Context context, long millis, int flags) {
        return DateUtils.formatDateTime(context, millis, flags);
    }

    /**
     * 格式化文件大小，将字节数据格式化成B KB M 单位相应数据
     *
     * @param context
     * @param sizeBytes
     * @return
     */
    public static String formatFileSize(Context context, long sizeBytes) {
        return Formatter.formatFileSize(context, sizeBytes);
    }

    /**
     * COMPLEX_UNIT_PX
     * COMPLEX_UNIT_DIP
     * COMPLEX_UNIT_PT
     * COMPLEX_UNIT_SP
     *
     * @param unit
     * @param value
     * @param metrics
     * @return
     */
    public static float applyDimension(int unit, float value, DisplayMetrics metrics) {
        return TypedValue.applyDimension(unit, value, metrics);
    }
}
