package com.annag.pokemon_app.service;

import com.annag.pokemon_app.data.Pokemon;

import java.util.List;

public interface PokemonService {

    List<Pokemon> getAllPokemons();
    Pokemon getPokemonById(int id);

    void deletePokemon(int id);

    Integer saveOrUpdate(Pokemon pokemon);

}
