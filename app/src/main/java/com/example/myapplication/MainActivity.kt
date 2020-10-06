package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

var username="pra"
var password="jos"
class MainActivity : AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"welcome",Toast.LENGTH_SHORT).show()

        }

    fun login(v:View){
        if(usernameid.text.toString()!=username || passwordid.text.toString()!= password ) {
            Toast.makeText(this, "login unsuccessful", Toast.LENGTH_SHORT).show()
//            var a= Intent(this,MainActivity::class.java)
//            startActivity(a)
        }

        else{
            Toast.makeText(this,"login successful",Toast.LENGTH_SHORT).show()
            var a= Intent(this,MainActivity2::class.java)
            startActivity(a)
        }

    }


}

