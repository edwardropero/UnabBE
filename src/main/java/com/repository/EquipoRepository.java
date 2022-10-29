package com.repository;

import com.models.EquipoModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EquipoRepository  extends CrudRepository<EquipoModel, Long> {
    
    
}
