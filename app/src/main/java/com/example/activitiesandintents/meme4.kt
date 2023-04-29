package com.example.activitiesandintents

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class meme4 : AppCompatActivity() {
    lateinit var btnprv3: Button
    lateinit var btnNext5: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme4)
        btnprv3 = findViewById(R.id.btnprv3)
        btnprv3.setOnClickListener {
            val intent = Intent(this, meme3::class.java)
            startActivity(intent)
        }
        btnNext5 = findViewById(R.id.btnNext5)
        btnNext5.setOnClickListener {
            val intent = Intent(this, meme5::class.java)
            startActivity(intent)
        }
    }
}