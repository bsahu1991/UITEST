package com.vicky.itconvtest.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.vicky.itconvtest.TestApplication
import com.vicky.itconvtest.TestApplication.Companion.DESC
import com.vicky.itconvtest.TestApplication.Companion.TITLE
import com.vicky.itconvtest.databinding.ActivityViewPostBinding
import com.vicky.itconvtest.model.PostModel
import com.vicky.itconvtest.view.adapter.PostAdapter

class ViewPostActivity : AppCompatActivity(), ContainerClickListener {

    private lateinit var adapter : PostAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityViewPostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvData.layoutManager = LinearLayoutManager(this)
        adapter = PostAdapter(arrayListOf(), this, this)
        binding.rvData.adapter = adapter


        (application as TestApplication).fillDummyData()


adapter.addData((application as TestApplication).getList())
        adapter.notifyDataSetChanged()
    }

    override fun onClick(postModel: PostModel) {
        startActivity(Intent(this, PostDetailsActivity::class.java).apply {
            putExtra(TITLE, postModel.title)
            putExtra(DESC, postModel.description)
        })
    }

}