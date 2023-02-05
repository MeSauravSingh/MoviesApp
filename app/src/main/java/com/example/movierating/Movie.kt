package com.example.movierating

data class Movie(
    val movieName: String,
    val poster: Int,
    val genre: String,
    val releaseYear: String,
    val category: String,
    val rating: String,
    val duration: String,
    val id: Int = 0
)
