package com.service;

import java.util.ArrayList;
import java.util.Optional;

import com.models.EquipoModel;
import com.repository.EquipoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/* */
@Service
public class EquipoService {
    @Autowired
    EquipoRepository equipoRepository;

    public ArrayList<EquipoModel> obtenerEquipos(){
        return (ArrayList<EquipoModel>) equipoRepository.findAll();
    }

    public EquipoModel guardarEquipo(EquipoModel equipo){
        return equipoRepository.save(equipo);
    }
    public EquipoModel guardarEquipo(EquipoModel equipo,int id){
        return equipoRepository.save(equipo);
    }
    public Optional<EquipoModel> obtenerPorId(Long id){
        return equipoRepository.findById(id);
    }
    public boolean eliminarEquipo(Long id) {
        try{
            equipoRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
    
}
