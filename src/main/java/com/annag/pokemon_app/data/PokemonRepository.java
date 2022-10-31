package com.annag.pokemon_app.data;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Set;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {

    @Query(value = "SELECT DISTINCT p.type FROM pokemon p", nativeQuery = true)
    Set<String> getAllPokemonTypes();

    @Query(value = "SELECT  * FROM pokemon WHERE name_english LIKE ? ", nativeQuery = true)
    List<Pokemon> findByEnglishName(String name);


//    List<Pokemon> findAll(String[] filters, Pageable page);
}