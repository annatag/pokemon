package com.annag.pokemon_app.data;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "type", uniqueConstraints = {
        @UniqueConstraint(columnNames = "ID")})
public class Type implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long type_id;

    private String firstType;
    private String secondType;

    public Long getId() {
        return type_id;
    }

    public void setId(Long type_id) {
        this.type_id = type_id;
    }

    public String getFirstType() {
        return firstType;
    }

    public void setFirstType(String firstType) {
        this.firstType = firstType;
    }

    public String getSecondType() {
        return secondType;
    }

    public void setSecondType(String secondType) {
        this.secondType = secondType;
    }

}