package com.example.myapplication

import android.media.MediaPlayer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main6.*

class MainActivity6 : AppCompatActivity() {

    val imagess=arrayOf(R.drawable.one,R.drawable.two,R.drawable.three)
    var i=0
    var c=0
    var c1=0
    var j=0
    var scr1=0
    var scr2=0

    fun score(){
        if(j==0&&i==1 || j==1&&i==2 ||j==2&&i==0)
            scr1++
        else if(j==i)
        else
            scr2++
    }

    fun formal(){
        scr1=0
        scr2=0
        MediaPlayer.create(this,R.raw.clap).start()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main6)
}
        fun pl1(v: View){
            MediaPlayer.create(this,R.raw.pop).start()
            j=(0..2).random()
            img1.setImageResource(imagess[j])
            c=1
            if(c==1&&c1==1){
                c=0
                c1=0
                score()
                if(scr1==5 ) {
                    Toast.makeText(this, "player1 won", Toast.LENGTH_SHORT).show()
                    formal()
                }
                else if(scr2==5){
                    formal()
                    Toast.makeText(this, "player2 won", Toast.LENGTH_SHORT).show()
                   }
                    textid.setText("player1 - player2\n$scr1            -       $scr2")

            }
        }

        fun pl2(v: View){
            MediaPlayer.create(this,R.raw.pop).start()
            i=(0..2).random()
            img2.setImageResource(imagess[i])
            c1=1
            if(c1==1&& c==1){
                c=0
                c1=0
                score()
                if(scr1==5 ) {
                    formal()
                    Toast.makeText(this, "player1 won", Toast.LENGTH_SHORT).show()
                }
                else if(scr2==5){
                    Toast.makeText(this, "player2 won", Toast.LENGTH_SHORT).show()
                    formal()

                }
                textid.setText("player1 - player2\n$scr1            -       $scr2")
            }
        }
    fun res(v: View){
        scr1=0
        scr2=0
        textid.setText("player1 - player2\n$scr1            -       $scr2")
    }



    }
