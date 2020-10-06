package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun changeusernameid(v: View){
        var a= Intent(this,MainActivity4::class.java)
        startActivity(a)
    }
    fun changepasswordid(v:View){
        var a= Intent(this,MainActivity3::class.java)
        startActivity(a)
    }
    fun infoid(v:View){
        var a= Intent(this,MainActivity5::class.java)
        startActivity(a)
    }
    fun spcid(v:View){
        var a= Intent(this,MainActivity7::class.java)
        startActivity(a)
    }
//
//    fun calci(v: View){
//        var a= Intent(this,MainActivity9::class.java)
//        startActivity(a)
//    }




}