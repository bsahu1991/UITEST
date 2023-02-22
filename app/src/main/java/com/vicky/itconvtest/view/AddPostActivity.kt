package com.vicky.itconvtest.view

import android.R.attr.data
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.vicky.itconvtest.TestApplication
import com.vicky.itconvtest.databinding.ActivityAddPostBinding
import com.vicky.itconvtest.model.PostModel


class AddPostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityAddPostBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSubmit.setOnClickListener {
            val title = binding.etTitle.text.toString()
            val desc = binding.etDesc.text.toString()


            (application as TestApplication).addPost(PostModel(title, desc, "user1", "date1"))
            binding.apply {
                etDesc.text.clear()
                etTitle.text.clear()
            }
            Toast.makeText(this, "Post Added", Toast.LENGTH_LONG).show()
        }
    }
}