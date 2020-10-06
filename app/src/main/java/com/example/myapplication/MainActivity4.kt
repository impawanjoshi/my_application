package com.example.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main4.*

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
    }


    fun changeuid(v: View){
        if(olduid.text.toString()== username ){
            if(newuid.text.toString()==reenteruid.text.toString()) {
                username = newuid.text.toString()
                Toast.makeText(this,"username changed succesfully", Toast.LENGTH_LONG).show()
            }
            else
                Toast.makeText(this,"username mismatched", Toast.LENGTH_LONG).show()

        }
        Toast.makeText(this,"username incorrect", Toast.LENGTH_LONG).show()

    }




}