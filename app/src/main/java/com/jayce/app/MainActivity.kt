package com.jayce.app

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.jayce.log.JLog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.tv_view).setOnClickListener(View.OnClickListener {
            JLog.i(TAG, "setOnClickListener")
        })
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}