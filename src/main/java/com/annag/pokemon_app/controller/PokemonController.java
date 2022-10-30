package com.annag.pokemon_app.controller;

import com.annag.pokemon_app.data.Pokemon;
import com.annag.pokemon_app.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class PokemonController {


    @Autowired
    PokemonService pokemonService;
    //creating a get mapping that retrieves all the pokemon detail from the database
    @GetMapping("/pokemon")
    private List<Pokemon> getAllPokemons()
    {
        return pokemonService.getAllPokemons();
    }

    @GetMapping("/pokemon/{id}")
    private Pokemon getPokemon(@PathVariable("id") int id)
    {
        return pokemonService.getPokemonById(id);
    }
    @DeleteMapping("/pokemon/{id}")
    private void deletePokemon(@PathVariable("id") int id)
    {
        pokemonService.deletePokemon(id);
    }

    @PostMapping("/pokemon")
    private int savePokemon(@RequestBody Pokemon pokemon)
    {
        pokemonService.saveOrUpdate(pokemon);
        return pokemon.getId();
    }
}