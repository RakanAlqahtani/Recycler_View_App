package com.example.recyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

var myList = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myRV = findViewById<RecyclerView>(R.id.rvMain)

        val colors = listOf("red","blue","Grren","purple","Orange","Yellow","Pink","Black","Sliver","sswwww","ssas","stttt")
//rvMain.adapter = RecyclerViewAdapter(this,myList)

       val myAdapter = RecyclerViewAdapter(this,myList)


btn_Enter.setOnClickListener{

    myList.add(et_Text.text.toString())
    et_Text.text.clear()
    myAdapter.notifyDataSetChanged()
}

        myRV.adapter = myAdapter
        myRV.layoutManager = LinearLayoutManager(this)





    }
}