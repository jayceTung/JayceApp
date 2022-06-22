package com.jayce.common

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * Create by jayce.dong on 2022/6/22
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initView()
        initData()
    }

    protected fun initData() {

    }

    protected fun initView() {

    }

    abstract fun getLayoutId(): Int
}