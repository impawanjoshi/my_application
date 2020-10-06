package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
    }



    fun vscmp(v: View){
        var a= Intent(this,MainActivity8::class.java)
        startActivity(a)
    }
    fun vshum(v: View){
        var a= Intent(this,MainActivity6::class.java)
        startActivity(a)
    }




}