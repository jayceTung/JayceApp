package com.jayce.uiweight.weight

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import com.jayce.common.utils.DensityUtil

/**
 * Create by jayce.dong on 2022/6/22
 */
class WaveLoadingView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private lateinit var waveBitmap: Bitmap
    private val defaultSize = DensityUtil.dip2px(150)

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        val widthSize = MeasureSpec.getSize(widthMeasureSpec)
        val heightMode = MeasureSpec.getMode(heightMeasureSpec)
        val heightSize = MeasureSpec.getSize(heightMeasureSpec)
        val measureWidth = if (widthMode == MeasureSpec.EXACTLY) widthSize else defaultSize.toInt()
        val measureHeight =
            if (heightMode == MeasureSpec.EXACTLY) heightSize else defaultSize.toInt()
        val measureSize = kotlin.math.min(measureWidth, measureHeight)
        setMeasuredDimension(measureSize, measureSize)
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)

    }
}