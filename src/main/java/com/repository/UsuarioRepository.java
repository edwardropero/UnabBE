package com.repository;

import com.models.UsuarioModel;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UsuarioRepository  extends CrudRepository<UsuarioModel, Long> {
    @Query(value = "SELECT * FROM usuarios where username = ?1 AND password = ?2", nativeQuery=true)
    UsuarioModel login(String username, String password);
    
}
