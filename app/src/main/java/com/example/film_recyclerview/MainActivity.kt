package com.example.film_recyclerview

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.film_recyclerview.databinding.ActivityMainBinding
import com.example.recyclerview.adapter.AdapterFilm
import com.example.recyclerview.model.ModelFilm

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterFilmes: AdapterFilm
    private val listFilms: MutableList<ModelFilm> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerViewFilms = binding.recyclerViewListaFilmes
        recyclerViewFilms.layoutManager = LinearLayoutManager(this)
        recyclerViewFilms.setHasFixedSize(true)
        adapterFilmes = AdapterFilm(this,listFilms)
        recyclerViewFilms.adapter = adapterFilmes
        films()
    }

    private fun films(){
        val film1 = ModelFilm ("Captain America - First Avenger")
        listFilms.add(film1)

        val film2 = ModelFilm ("Captain Marvel")
        listFilms.add(film2)

        val film3 = ModelFilm ("The Incredible Hulk")
        listFilms.add(film3)

        val film4 = ModelFilm ("Iron Man")
        listFilms.add(film4)

        val film5 = ModelFilm ("Iron Man 2")
        listFilms.add(film5)

        val film6 = ModelFilm ("Thor")
        listFilms.add(film6)

        val film7 = ModelFilm ("Avengers")
        listFilms.add(film7)

        val film8 = ModelFilm ("Iron Man 3")
        listFilms.add(film8)

    }

}