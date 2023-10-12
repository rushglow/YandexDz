package com.example.yandexdz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toDo_recycler: RecyclerView = findViewById(R.id.recyclerView)
        toDo_recycler.layoutManager = LinearLayoutManager(this)
        toDo_recycler.adapter = ToDoAdapter(getList())
    }
    private fun getList():List<ToDoItem>{
        lateinit var repos: ToDoItemsRepository
        var listOfItems:List<ToDoItem> = repos.itemsRepository
        return listOfItems
    }
}