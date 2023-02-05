package com.example.movierating

import android.os.Bundle
import android.view.View
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.movierating.databinding.FragmentHomeBinding


class HomeFragment : Fragment(R.layout.fragment_home){

    private lateinit var  binding: FragmentHomeBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)

        binding.apply {

            val movieAdapter = MovieAdapter()
            recyclerView.apply {
                layoutManager = LinearLayoutManager(requireContext())
                adapter = movieAdapter
            }
            movieAdapter.submitList(getMoviesList())

            etSearch.doAfterTextChanged {
                val txt = etSearch.text
                val list = getMoviesList().filter {it.movieName.lowercase().contains(txt)}
                movieAdapter.submitList(list)
            }
        }
    }

}