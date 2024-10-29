package com.example.tp1.univ

sealed class Result{
    data class Success(val note : Int): Result()
    data class Failure(val note : Int): Result()
    object NoResultYet :Result()
}

