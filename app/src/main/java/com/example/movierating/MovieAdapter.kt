package com.example.movierating

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.movierating.databinding.RowMovieBinding

class MovieAdapter(
): ListAdapter<Movie, MovieAdapter.ViewHolder>(DiffCallBack()) {

    inner class ViewHolder(private val binding: RowMovieBinding):
        RecyclerView.ViewHolder(binding.root){

        fun bind(myMovie: Movie){
            binding.apply {
                myMovie.apply {
                    tvMovieName.text = movieName
                    tvGenre.text = genre
                    tvReleaseYear.text = releaseYear
                    tvCategory.text = category
                    tvRating.text = rating
                    tvDuration.text = duration
                    ivPoster.setBackgroundResource(poster)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = RowMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = getItem(position)
        holder.bind(currentItem)
    }

    class DiffCallBack: DiffUtil.ItemCallback<Movie>(){
        override fun areItemsTheSame(oldItem: Movie, newItem: Movie): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Movie, newItem: Movie): Boolean {
            return oldItem == newItem
        }
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

}