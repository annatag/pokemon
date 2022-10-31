package com.annag.pokemon_app.data;

import org.hibernate.annotations.Table;
import javax.persistence.*;



@Entity
@Table(appliesTo = "pokemon")
public class Pokemon implements Serializable
{
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String name_english;

    @Column
    private String name_japanese;

    @Column
    private String name_chinese;

    @Column
    private String name_french;

    @Column
    @ElementCollection
    @CollectionTable (name="type", joinColumns = @JoinColumn(name ="id"))
    private Set<String> type;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName_english() {
        return name_english;
    }

    public void setName_english(String name_english) {
        this.name_english = name_english;
    }

    public String getName_japanese() {
        return name_japanese;
    }

    public void setName_japanese(String name_japanese) {
        this.name_japanese = name_japanese;
    }

    public String getName_chinese() {
        return name_chinese;
    }

    public void setName_chinese(String name_chinese) {
        this.name_chinese = name_chinese;
    }

    public String getName_french() {
        return name_french;
    }

    public void setName_french(String name_french) {
        this.name_french = name_french;
    }

    public Set<String> getType() {
        return type;
    }

    public void setType(Set<String> type) {
        this.type = type;
    }

    public int getBase_hp() {
        return base_hp;
    }

    public void setBase_hp(int base_hp) {
        this.base_hp = base_hp;
    }

    public int getBase_attack() {
        return base_attack;
    }

    public void setBase_attack(int base_attack) {
        this.base_attack = base_attack;
    }

    public int getBase_defence() {
        return base_defence;
    }

    public void setBase_defence(int base_defence) {
        this.base_defence = base_defence;
    }

    public int getBase_sp_attack() {
        return base_sp_attack;
    }

    public void setBase_sp_attack(int base_sp_attack) {
        this.base_sp_attack = base_sp_attack;
    }

    public int getBase_sp_defence() {
        return base_sp_defence;
    }

    public void setBase_sp_defence(int base_sp_defence) {
        this.base_sp_defence = base_sp_defence;
    }

    public int getBase_speed() {
        return base_speed;
    }

    public void setBase_speed(int base_speed) {
        this.base_speed = base_speed;
    }
}