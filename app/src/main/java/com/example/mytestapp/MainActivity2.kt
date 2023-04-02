package com.example.mytestapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var btn1 = findViewById<ImageView>(R.id.member1)
        var btn2 = findViewById<ImageView>(R.id.member2)
        var btn3 = findViewById<ImageView>(R.id.member3)
        var btn4 = findViewById<ImageView>(R.id.member4)
        var btn5 = findViewById<ImageView>(R.id.member5)
        var btn6 = findViewById<ImageView>(R.id.member6)
        var btn7 = findViewById<ImageView>(R.id.member7)
        var btn8 = findViewById<ImageView>(R.id.member8)
        var btn9 = findViewById<ImageView>(R.id.member9)

        btn1.setOnClickListener {

            var intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "1")
            startActivity(intent)
        }

        btn2.setOnClickListener {

            var intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "2")
            startActivity(intent)
        }

        btn3.setOnClickListener {

            var intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "3")
            startActivity(intent)
        }

        btn4.setOnClickListener {

            var intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "4")
            startActivity(intent)
        }

        btn5.setOnClickListener {

            var intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "5")
            startActivity(intent)
        }

        btn6.setOnClickListener {

            var intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "6")
            startActivity(intent)
        }

        btn7.setOnClickListener {

            var intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "7")
            startActivity(intent)
        }

        btn8.setOnClickListener {

            var intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "8")
            startActivity(intent)
        }

        btn9.setOnClickListener {

            var intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "9")
            startActivity(intent)
        }


    }
}