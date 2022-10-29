package com.models;

import javax.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "usuarios")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String nombre;
    private String correo;
    private String username;
    private String password;
    
}
