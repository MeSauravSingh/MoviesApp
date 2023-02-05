package com.example.movierating

fun getMoviesList(): MutableList<Movie> {

        val movieList = mutableListOf<Movie>()

        movieList.add(Movie(
            "Avenger: Endgame",
            R.drawable.img_1,
            "Action, Adventure, Drama, Sci-Fi",
            "2019",
            "13+",
            "8.4",
            "03:01 min"
        ))

        movieList.add(Movie(
            "Pathaan",
            R.drawable.img_2,
            "Action, Drama, Thriller",
            "2023",
            "13+",
            "6.7",
            "02:26 min"
        ))

        movieList.add(Movie(
            "The Dark Knight",
            R.drawable.img_3,
            "Action, Crime, Drama, Thriller",
            "2008",
            "13+",
            "9.0",
            "02:32 min"
        ))

        movieList.add(Movie(
            "Avatar: The Way of Water",
            R.drawable.img_4,
            "Action, Adventure, Fantasy, Sci-Fi",
            "2022",
            "13+",
            "7.8",
            "03:12 min"
        ))

        return movieList
    }


