package com.jayce.uiweight.weight

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

/**
 * Create by jayce.dong on 2022/6/22
 */
class WaveLoadingView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private lateinit var waveBitmap: Bitmap

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

    }
}