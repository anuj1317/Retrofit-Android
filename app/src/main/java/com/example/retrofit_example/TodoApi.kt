package com.example.retrofit_example

import retrofit2.Response
import retrofit2.http.GET


//interface to make requests
interface TodoApi {

    @GET("/todos")
    suspend fun getTodos(): Response<List<Todo>>

}