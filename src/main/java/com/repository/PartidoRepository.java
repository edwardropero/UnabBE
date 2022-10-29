package com.repository;

import com.models.PartidoModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PartidoRepository  extends CrudRepository<PartidoModel, Long> {
    
    
}
