package com.example.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.film_recyclerview.databinding.SinglefilmBinding
import com.example.recyclerview.model.ModelFilm

class AdapterFilm(private val context: Context, private val list_Film: MutableList<ModelFilm>):
        RecyclerView.Adapter<AdapterFilm.FilmViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val itemList = SinglefilmBinding.inflate(LayoutInflater.from(context),parent,false)
        return FilmViewHolder(itemList)
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        holder.txtFilmTitle.text = list_Film[position].title
    }

    override fun getItemCount() = list_Film.size

    inner class FilmViewHolder(binding: SinglefilmBinding): RecyclerView.ViewHolder(binding.root) {

        val txtFilmTitle = binding.txtFilmTitle

    }
}