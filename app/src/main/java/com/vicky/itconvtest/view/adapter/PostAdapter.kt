package com.vicky.itconvtest.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.vicky.itconvtest.R
import com.vicky.itconvtest.model.PostModel
import com.vicky.itconvtest.view.ContainerClickListener


class PostAdapter (private val item: ArrayList<PostModel>, private val context: Context, private val containerClickListener: ContainerClickListener) :
    RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return  ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.post_item_row_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.apply {
            postTitle.text = item[position].title
            postDate.text = item[position].postDate
            postUser.text = item[position].postedBy
            container.setOnClickListener { containerClickListener.onClick(item[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return item.size
    }

    fun addData(result : List<PostModel>){
        item.addAll(result)
    }
}

class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
    val postTitle: TextView = view.findViewById(R.id.tvPostTitle)
    val postDate: TextView = view.findViewById(R.id.tvPostDate)
    val postUser: TextView = view.findViewById(R.id.tvPostUser)
    val container: ConstraintLayout = view.findViewById(R.id.container)
}