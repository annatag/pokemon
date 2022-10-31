package com.annag.pokemon_app.controller;

import com.annag.pokemon_app.data.Pokemon;
import com.annag.pokemon_app.exceptions.NotFoundException;
import com.annag.pokemon_app.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/pokemons/all")
    public List < Pokemon > getAllPokemons() {
        return pokemonService.getAllPokemons();
    }

    @GetMapping("/pokemons/{id}")
    public Pokemon getPokemon (@PathVariable("id") int id) throws NotFoundException {
        return pokemonService.getPokemonById(id);
    }

    @GetMapping("/pokemons/english")
    public List<Pokemon> getPokemonsByName (@RequestParam("name") String name) {
        return pokemonService.getPokemonsByName(name);
    }

    @GetMapping("/pokemons/types")
    public Set<String> getAllPokemonTypes () {
        Set<String> result = pokemonService.getAllPokemonTypes();
        System.out.println(result);
        return result;
    }

    @PostMapping("/pokemons")
    public Pokemon saveOrUpdate( @RequestBody Pokemon pokemon) {
        return pokemonService.saveOrUpdate(pokemon);
    }

//    @GetMapping("/pokemons/filter/{filters}")
//    public Optional<List<Pokemon>> getListOfPFilteredPokemons(
//            @And({@Spec(path = "hp", params = "base_HP", spec = GreaterThanOrEqual.class),
//                    @Spec(path = "attack", params = "base_Attack", spec = LessThanOrEqual.class),
//                    @Spec(path = "base_defence", params = "base_Defense", spec = GreaterThanOrEqual.class),
//                    @Spec(path = "sp_attack", params = "base_Sp_attack", spec = LessThanOrEqual.class),
//                    @Spec(path = "speed", params = "base_Speed", spec = GreaterThanOrEqual.class),
//                    @Spec(path = "defemce", params = "defense[lte]", spec = LessThanOrEqual.class),
//                    @Spec(path = "name_english", params = "name_english"),
//                    @Spec(path = "name_japanease", params = "name_japanease"),
//                    @Spec(path = "name_chinease", params = "name_chinease"),
//                    @Spec(path = "name_french", params = "name_french", specs = Equal.class)}) Specification<Pokemon> specs, Pageable page Pageable page)
//    {
//        return pokemonService.getListOfPFilteredPokemons(specs, page);
//    }
}
