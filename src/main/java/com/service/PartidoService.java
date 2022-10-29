package com.service;

import java.util.ArrayList;
import java.util.Optional;

import com.models.PartidoModel;
import com.repository.PartidoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartidoService {
    @Autowired
    PartidoRepository PartidoRepository;

    public ArrayList<PartidoModel> obtenerPartidos(){
        return (ArrayList<PartidoModel>) PartidoRepository.findAll();
    }

    public PartidoModel guardarPartido(PartidoModel Partido){
        return PartidoRepository.save(Partido);
    }
    public Optional<PartidoModel> obtenerPorId(Long id){
        return PartidoRepository.findById(id);
    }
    public boolean eliminarPartido(Long id) {
        try{
            PartidoRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
    
}
