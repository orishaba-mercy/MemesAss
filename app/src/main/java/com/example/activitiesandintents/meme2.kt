package com.example.activitiesandintents

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class meme2 : AppCompatActivity() {
    lateinit var btnNextprv1: Button
    lateinit var btnNext3: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme2)
        btnNextprv1 = findViewById(R.id.btnNextprv1)
        btnNextprv1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btnNext3 = findViewById(R.id.btnNext3)
        btnNext3.setOnClickListener {
            val intent = Intent(this, meme3::class.java)
            startActivity(intent)
        }
    }
}