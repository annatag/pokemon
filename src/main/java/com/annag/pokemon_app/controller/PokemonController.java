package com.annag.pokemon_app.controller;

import com.annag.pokemon_app.data.Pokemon;
import com.annag.pokemon_app.exceptions.NotFoundException;
import com.annag.pokemon_app.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/pokemons")
    private List < Pokemon > getAllPokemons() {
        return pokemonService.getAllPokemons();
    }

    @GetMapping("/pokemons/{id}")
    private Pokemon getPokemon (@PathVariable("id") int id) throws NotFoundException {
        return pokemonService.getPokemonById(id);
    }

//    @GetMapping("/pokemons/{filter}")
//    private List<Pokemon> getPokemonsByFilter (@PathVariable("filter") String filter) {
//        return pokemonService.getPokemonsByFilter(filter);
//    }

    @GetMapping("/pokemons/types")
    private Pokemon getAllPokemonTypes () {
        return pokemonService.getAllPokemonTypes();
    }

    @PostMapping("/pokemons")
    public Pokemon saveOrUpdate( @RequestBody Pokemon pokemon) {
        return pokemonService.saveOrUpdate(pokemon);
    }

//    @GetMapping("/pokemons/{id}")
//    public ResponseEntity< Pokemon > getEmployeeById(@PathVariable(value = "id") Integer pokemonId)
//            throws NotFoundException {
//        Pokemon employee = pokemonRepository.findById(pokemonId)
//                .orElseThrow(() -> new NotFoundException("Employee not found for this id :: " + pokemonId));
//        return ResponseEntity.ok().body(employee);
//    }

//    @PostMapping("/pokemons")
//    public Pokemon createPokemon( @RequestBody Pokemon pokemon) {
//        return pokemonRepository.save(pokemon);
//    }

//    @PutMapping("/pokemons/{id}")
//    public ResponseEntity < Pokemon > updatePokemon(@PathVariable(value = "id") Integer pokemonId,
//                                                    @RequestBody Pokemon pokemonDetails) throws NotFoundException {
//        Pokemon pokemon = pokemonRepository.findById(pokemonId)
//                .orElseThrow(() -> new NotFoundException("Pokemon not found for this id :: " + pokemonId));
////TODO - finish all details
//        pokemon.setBase_attack(pokemonDetails.getBase_attack());
//        pokemon.setBase_defence(pokemonDetails.getBase_defence());
//        pokemon.setName_english(pokemonDetails.getName_english());
//        final Pokemon updatePokemon = pokemonRepository.save(pokemon);
//        return ResponseEntity.ok(updatePokemon);
//    }

//    @DeleteMapping("/pokemons/{id}")
//    public Map< String, Boolean > deletePokemon(@PathVariable(value = "id") Integer pokemonId)
//            throws NotFoundException {
//        Pokemon pokemon = pokemonRepository.findById(pokemonId)
//                .orElseThrow(() -> new NotFoundException("Pokemon not found for this id :: " + pokemonId));
//
//        pokemonRepository.delete(pokemon);
//        Map < String, Boolean > response = new HashMap< >();
//        response.put("deleted", Boolean.TRUE);
//        return response;
//    }
}

//public class PokemonController {
//
//
//    @Autowired
//    PokemonService pokemonService;
//    //creating a get mapping that retrieves all the pokemon detail from the database
//    @GetMapping("/pokemon")
//    private List<Pokemon> getAllPokemons()
//    {
//        return pokemonService.getAllPokemons();
//    }
//
//    @GetMapping("/pokemon/{id}")
//    private Pokemon getPokemon(@PathVariable("id") int id)
//    {
//        return pokemonService.getPokemonById(id);
//    }
//    @DeleteMapping("/pokemon/{id}")
//    private void deletePokemon(@PathVariable("id") int id)
//    {
//        pokemonService.deletePokemon(id);
//    }
//
//    @PostMapping("/pokemon")
//    private int savePokemon(@RequestBody Pokemon pokemon)
//    {
//        System.out.println("/okemon");
//        pokemonService.saveOrUpdate(pokemon);
//        return pokemon.getId();
//    }
//}