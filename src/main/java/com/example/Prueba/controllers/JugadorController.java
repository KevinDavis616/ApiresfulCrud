package com.example.Prueba.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Prueba.models.JugadorModel;
import com.example.Prueba.services.JugadorService;

@RestController
@RequestMapping
public class JugadorController {
    @Autowired
    JugadorService jugadorService;

    @PostMapping("/Crear")
    public JugadorModel GuardarModel(@RequestBody JugadorModel Jugador){
        return this.jugadorService.guardar(Jugador);
    }
    @GetMapping("/Todo")
    public ArrayList<JugadorModel> obtenertodoModel(){
        return jugadorService.obtenerJugadores();
    }
    @GetMapping(path = "/{Id}")
    public Optional<JugadorModel> obtenerJugadorModel(@PathVariable("Id") Integer Id){
        return this.jugadorService.obtenerporid(Id);
    }
    @DeleteMapping(path = "/{Id}")
    public String eliminarJugador(@PathVariable("Id") Integer Id){
        boolean ok = this.jugadorService.eliminar(Id);
        if (ok){
            return "El Jugador fue eliminado" + Id;
        }
        else{
            return "EL Jugador no se encuentra el registro";
        }
    }

}

