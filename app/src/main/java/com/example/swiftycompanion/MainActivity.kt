package com.example.swiftycompanion

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(){
    //    lateinit var btnSingin : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
//        }
//        btnSingin = findViewById(R.id.sign_in_button)
//        btnSingin.setOnClickListener(this)
        }

//    override fun onClick(p0: View?) {
//        when (p0?.id) {
//            R.id.sign_in_button -> { println("Login with intra") }
//        }
    }

}
