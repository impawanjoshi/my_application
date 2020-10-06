package com.example.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import kotlinx.android.synthetic.main.activity_main5.*

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        marid.text="this application is developed by Mr. Prabhakar,a professional android developer"
        marid.setSingleLine()
        marid.ellipsize= TextUtils.TruncateAt.MARQUEE
        marid.marqueeRepeatLimit=-1
        marid.isSelected=true
    }


}