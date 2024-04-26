package com.mycompany.biblioteca.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Livros implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column()
    private String CodLivro;
      @Column(nullable = false)
    private String tituloDoLivro;
     @Column(nullable = false)
    private String autor;
      @Column(nullable = false)
    private String editora;
       @Column(nullable = false)
    private int quantidade;
        @Column(nullable = false)
    private String estado;
            @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private String dataDeEntrada;
}
