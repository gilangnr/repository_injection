package com.dicoding.newsapp.data

import kotlin.Result

sealed class Result<out R> private constructor(){
    data class Success<out T>(val data: T) : com.dicoding.newsapp.data.Result<T>()
    data class Error(val error: String) : com.dicoding.newsapp.data.Result<Nothing>()
    object Loading : com.dicoding.newsapp.data.Result<Nothing>()

}