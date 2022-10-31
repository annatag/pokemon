package com.annag.pokemon_app.service;

import com.annag.pokemon_app.data.Pokemon;
import com.annag.pokemon_app.exceptions.NotFoundException;
import org.springframework.data.jpa.domain.Specification;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;
import java.util.Set;


public interface PokemonService {

    List<Pokemon> getAllPokemons();
    Pokemon getPokemonById(int id) throws NotFoundException;

    List<Pokemon> getPokemonsByName(String name);

    Set<String> getAllPokemonTypes();

    Pokemon saveOrUpdate(Pokemon pokemon);

    void deletePokemon(int id);

//    Optional<List<Pokemon>> getListOfPFilteredPokemons(Specification<Pokemon> filters, Pageable page);
}
