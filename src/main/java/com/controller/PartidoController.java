package com.controller;

import java.util.ArrayList;
import java.util.Optional;

import com.models.PartidoModel;
import com.service.PartidoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/partido")
public class PartidoController {
    @Autowired
    PartidoService PartidoService;
    
    @CrossOrigin(origins="*")
    @GetMapping()
    public ArrayList<PartidoModel> obtenerPartidos(){
        return PartidoService.obtenerPartidos();
    }
    
    @CrossOrigin(origins="*")
    @PostMapping()
    public PartidoModel guardarPartido(@RequestBody PartidoModel Partido){
        return this.PartidoService.guardarPartido(Partido);
    }

    @CrossOrigin(origins="*")
    @GetMapping( path = "/{id}")
    public Optional<PartidoModel> obtenerPorId(@PathVariable("id") Long id) {
        return this.PartidoService.obtenerPorId(id);
    }

    @CrossOrigin(origins="*")
    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.PartidoService.eliminarPartido(id);
        if (ok){
            return "Partido eliminado";
        }else{
            return "No pudo eliminar el partido";
        }
    }
}
