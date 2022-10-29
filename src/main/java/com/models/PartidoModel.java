package com.models;

import javax.persistence.*;

import lombok.Data;

import java.util.Calendar;

@Entity
@Data
@Table(name = "partidos")
public class PartidoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String usuario;
    private Long local;
    private Long visitante;
    private Calendar fecha;
    private int golLocal;
    private int golVisitante; 
}
