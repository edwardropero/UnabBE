package com.models;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "equipos")
public class EquipoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String nombre; 
}
