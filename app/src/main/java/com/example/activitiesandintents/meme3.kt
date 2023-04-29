package com.example.activitiesandintents

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class meme3 : AppCompatActivity() {
    lateinit var btnprv2: Button
    lateinit var btnNext4: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme3)
        btnprv2 = findViewById(R.id.btnprv2)
        btnprv2.setOnClickListener {
            val intent = Intent(this, meme2::class.java)
            startActivity(intent)
        }
        btnNext4 = findViewById(R.id.btnNext4)
        btnNext4.setOnClickListener {
            val intent = Intent(this, meme4::class.java)
            startActivity(intent)
    }
}
}