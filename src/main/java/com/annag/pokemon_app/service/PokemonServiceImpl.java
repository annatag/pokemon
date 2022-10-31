package com.annag.pokemon_app.service;

import com.annag.pokemon_app.data.Pokemon;
import com.annag.pokemon_app.data.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class PokemonServiceImpl implements PokemonService {
    @Autowired
    PokemonRepository pokemonRepository;

    public PokemonServiceImpl(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

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
    public List<Pokemon> getPokemonsByName(String name) {
       return pokemonRepository.findByEnglishName(name);
    }

    @Override
    public Pokemon saveOrUpdate(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    @Override
    public Set<String> getAllPokemonTypes() {
        return pokemonRepository.getAllPokemonTypes();
    }

    @Override
    public void deletePokemon(int id) {
        pokemonRepository.deleteById(id);
    }

//    @Override
//    public Optional<List<Pokemon>> getListOfPFilteredPokemons(Specification<Pokemon> filters, Pageable page) {
//        List<Pokemon> filteredPokemons = pokemonRepository.findAll(filters, page);
//
//        Optional<List<Pokemon>> filteredPokemonList = Optional.of(filteredPokemons.stream().toList());
//
//        return filteredPokemonList;
//    }
}
