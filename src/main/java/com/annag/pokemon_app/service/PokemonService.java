package com.annag.pokemon_app.service;

import com.annag.pokemon_app.data.Pokemon;
import com.annag.pokemon_app.exceptions.NotFoundException;

import java.util.List;


public interface PokemonService {

    List<Pokemon> getAllPokemons();
    Pokemon getPokemonById(int id) throws NotFoundException;

    List<Pokemon> getPokemonsByFilter(String filter);

    Pokemon getAllPokemonTypes();

    Pokemon saveOrUpdate(Pokemon pokemon);

    void deletePokemon(int id);
}
