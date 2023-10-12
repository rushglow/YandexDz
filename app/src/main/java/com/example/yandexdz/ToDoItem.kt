package com.example.yandexdz

import java.util.Date

data class ToDoItem(
    var id: Int,
    var done: Boolean,
    var text: String,
    var priority: Int
)