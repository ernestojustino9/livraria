package com.mycompany.biblioteca.models;

import jakarta.persistence.Entity;

@Entity
public class Livros {

    private String CodLivro;
    private String tituloDoLivro;
    private String autor;
    private String editora;
    private int quantidade;
    private String estado;
    private String dataDeEntrada;
}
