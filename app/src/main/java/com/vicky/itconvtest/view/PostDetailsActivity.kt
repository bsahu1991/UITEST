package com.vicky.itconvtest.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vicky.itconvtest.TestApplication.Companion.DESC
import com.vicky.itconvtest.TestApplication.Companion.TITLE
import com.vicky.itconvtest.databinding.ActivityAddPostBinding
import com.vicky.itconvtest.databinding.ActivityPostDetailsBinding

class PostDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPostDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

       val title =  intent.getStringExtra(TITLE)
        val desc =  intent.getStringExtra(DESC)

        binding.tvDetailTitle.text = title
        binding.tvDetailDescription.text = desc
    }
}