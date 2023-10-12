package com.example.yandexdz

import android.animation.LayoutTransition
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ToDoAdapter(private val toDoItemArray:List<ToDoItem>): RecyclerView.Adapter<ToDoAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val toDoTextView: TextView = itemView.findViewById(R.id.to_do_text)
        val dateTextView: TextView = itemView.findViewById(R.id.to_do_date)
        val priorityImgView: ImageView = itemView.findViewById(R.id.priority)
        val checkBox: ImageView = itemView.findViewById(R.id.checkbox_btn)
        val infoImgBtn: ImageView = itemView.findViewById(R.id.info_btn)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.recycler_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return toDoItemArray.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.toDoTextView.text = text[position]

    }
}

