package com.example.yandexdz

import java.util.ArrayList

class ToDoItemsRepository() : ArrayList<ToDoItem>() {
    var itemsRepository: MutableList<ToDoItem> = arrayListOf()
    fun addItem(item: ToDoItem){
        itemsRepository.add(item)
    }

}