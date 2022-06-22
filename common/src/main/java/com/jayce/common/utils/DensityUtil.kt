package com.jayce.common.utils

import android.content.res.Resources

/**
 * Create by jayce.dong on 2022/6/22
 */
object DensityUtil {
    val density = Resources.getSystem().displayMetrics.density

    fun dip2px(dp: Int): Int {
        return (dp * density).toInt()
    }

    fun px2dip(px: Int): Int {
        return (px / density).toInt()
    }

    fun appWidth(): Int {
        return Resources.getSystem().displayMetrics.widthPixels
    }

    fun appHeight(): Int {
        return Resources.getSystem().displayMetrics.heightPixels
    }
}