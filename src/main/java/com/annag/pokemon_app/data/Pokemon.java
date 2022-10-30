package com.annag.pokemon_app.data;

import lombok.Data;
import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;


@Data
@Table(appliesTo = "pokemon")
public class Pokemon
{
    //mark id as primary key
    @Id
    @Column
    private int id;

    @Column
    private String name_english;

    @Column
    private String name_japanese;

    @Column
    private String name_chinese;

    @Column
    private String name_french;

    @Column
    private String type;

    @Column
    private int base_hp;

    @Column
    private int base_attack;

    @Column
    private int base_defence;

    @Column
    private int base_sp_attack;

    @Column
    private int base_sp_defence;

    @Column
    private int base_speed;

}