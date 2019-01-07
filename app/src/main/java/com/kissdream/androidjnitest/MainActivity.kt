package com.kissdream.androidjnitest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

/**
 *
 * AndroidStudio JNI详细教程+Gradle3.0以上JNI爬坑之旅
 * https://www.jianshu.com/p/997ae19a5fae
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text.text=myJNIUtils().name
    }
}
