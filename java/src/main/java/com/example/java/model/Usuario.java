package com.example.java.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Usuario {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String nome;
    private String email;
    private String senha;
}
