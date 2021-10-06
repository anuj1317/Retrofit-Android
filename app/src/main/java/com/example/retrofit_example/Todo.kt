package com.example.retrofit_example


//Model Class
data class Todo(
    val completed: Boolean,
    val id: Int,
    val title: String,
    val userId: Int
)