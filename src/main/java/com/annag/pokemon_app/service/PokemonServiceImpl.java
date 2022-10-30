package com.annag.pokemon_app.service;

import com.annag.pokemon_app.data.Pokemon;
import com.annag.pokemon_app.data.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PokemonServiceImpl implements PokemonService {
    @Autowired
    PokemonRepository pokemonRepository;

//    public PokemonServiceImpl(PokemonRepository pokemonRepository) {
//        this.pokemonRepository = pokemonRepository;
//    }

    @Override
    public List<Pokemon> getAllPokemons() {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.addAll(pokemonRepository.findAll());
        return pokemons;
    }

    @Override
    public Pokemon getPokemonById(int id) {
        return  pokemonRepository.findById(id).get();

    }

    @Override
    public List<Pokemon> getPokemonsByFilter(String filter) {
        return null;
    }

    @Override
    public Pokemon saveOrUpdate(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    @Override
    public Pokemon getAllPokemonTypes() {
        return null;
    }

    @Override
    public void deletePokemon(int id) {
        pokemonRepository.deleteById(id);
    }
}
