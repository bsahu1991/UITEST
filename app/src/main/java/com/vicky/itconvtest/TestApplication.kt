package com.vicky.itconvtest

import android.app.Application
import com.vicky.itconvtest.model.PostModel

class TestApplication: Application() {
    val myList : MutableList<PostModel> = mutableListOf()
    companion object{
       const val  TITLE = "title"
        const val  DESC = "desc"
    }

    fun fillDummyData(){
        val postModel1 = PostModel("title1","des1","user1","date1")
        val postModel2 = PostModel("title2","des1","user1","date1")
        val postModel3 = PostModel("title3","des1","user1","date1")
        val postModel4 = PostModel("title4","des1","user1","date1")
        val postModel5 = PostModel("title5","des1","user1","date1")
        val postModel6 = PostModel("title6","des1","user1","date1")
        val postModel7 = PostModel("title7","des1","user1","date1")
        val postModel8 = PostModel("title8","des1","user1","date1")
        val postModel9 = PostModel("title9","des1","user1","date1")
        val postModel10 = PostModel("title10","des1","user1","date1")
        val postModel11 = PostModel("title11","des1","user1","date1")
        val postModel12 = PostModel("title12","des1","user1","date1")
        val postModel13 = PostModel("title13","des1","user1","date1")
        val postModel14 = PostModel("title14","des1","user1","date1")
        val postModel15 = PostModel("title15","des1","user1","date1")


        myList.add(postModel1)
        myList.add(postModel2)
        myList.add(postModel3)
        myList.add(postModel4)
        myList.add(postModel5)
        myList.add(postModel6)
        myList.add(postModel7)
        myList.add(postModel8)
        myList.add(postModel9)
        myList.add(postModel10)
        myList.add(postModel11)
        myList.add(postModel12)
        myList.add(postModel13)
        myList.add(postModel14)
        myList.add(postModel15)

    }

        fun addPost(postModel: PostModel){
            myList.add(postModel)
        }


    fun getList(): MutableList<PostModel>{
        return myList
    }

}