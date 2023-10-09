package com.example.yandexdz

import java.util.Date

data class ToDoItem(
    val id: Int,
    val done: Boolean,
    val text: String,
    val priority: Int
)