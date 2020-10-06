package com.example.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }

        fun changeid(v: View){
            if(oldpasswordid.text.toString()== password ){
                if(newpasswordid.text.toString()==reenterid.text.toString()) {
                    password = newpasswordid.text.toString()
                    Toast.makeText(this,"password changed succesfully",Toast.LENGTH_LONG).show()
                }
                else
                    Toast.makeText(this,"password mismatched",Toast.LENGTH_LONG).show()

            }
            Toast.makeText(this,"password incorrect",Toast.LENGTH_LONG).show()

        }


}