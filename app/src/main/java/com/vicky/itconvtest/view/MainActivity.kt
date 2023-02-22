package com.vicky.itconvtest.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vicky.itconvtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPost.setOnClickListener {
            val intent = Intent(this, AddPostActivity::class.java)
            startActivity(intent)
        }

        binding.btnView.setOnClickListener {
            val intent = Intent(this, ViewPostActivity::class.java)
            startActivity(intent)
        }
    }
}