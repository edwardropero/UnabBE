package com.controller;

import java.util.ArrayList;
import java.util.Optional;

import com.models.EquipoModel;
import com.service.EquipoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/equipo")
public class EquipoController {
    @Autowired
    EquipoService equipoService;
    
    @CrossOrigin(origins="*")
    @GetMapping()
    public ArrayList<EquipoModel> obtenerEquipos(){
        return equipoService.obtenerEquipos();
    }
    
    @CrossOrigin(origins="*")
    @PostMapping()
    public EquipoModel guardarEquipo(@RequestBody EquipoModel equipo){
        return this.equipoService.guardarEquipo(equipo);
    }

    @CrossOrigin(origins="*")
    @PutMapping( path = "/{id}")
    public EquipoModel guardarEquipo(@RequestBody EquipoModel equipo,@PathVariable("id") Long id){
        return this.equipoService.guardarEquipo(equipo);
    }

    @CrossOrigin(origins="*")
    @GetMapping( path = "/{id}")
    public Optional<EquipoModel> obtenerPorId(@PathVariable("id") Long id) {
        return this.equipoService.obtenerPorId(id);
    }

    @CrossOrigin(origins="*")
    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.equipoService.eliminarEquipo(id);
        if (ok){
            return "Equipo eliminado";
        }else{
            return "No pudo eliminar el equipo";
        }
    }
}
