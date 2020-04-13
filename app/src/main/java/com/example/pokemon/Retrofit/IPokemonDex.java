package com.example.pokemon.Retrofit;

import com.example.pokemon.Models.Pokedex;

import io.reactivex.Observable;

import retrofit2.http.GET;

public interface IPokemonDex {

    @GET("pokedex.json")
    Observable<Pokedex> getListPokemon();

}
