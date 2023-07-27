package com.example.Prueba.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Prueba.models.JugadorModel;
import com.example.Prueba.repositories.JugadoresRepository;



@Service
public class JugadorService {
    
    @Autowired
    JugadoresRepository JugadoresRepository;

    //Buscar todos los registros
    public ArrayList<JugadorModel> obtenerJugadores(){
        return (ArrayList<JugadorModel>) JugadoresRepository.findAll();
    
    
    }
    //Buscar por ID 
    public Optional<JugadorModel> obtenerporid(Integer Id){
        return JugadoresRepository.findById(Id);
    }
    //Metodo para guardar un jugador
    public JugadorModel guardar(JugadorModel Jugadores){
        return JugadoresRepository.save(Jugadores);
    }

    public boolean eliminar(Integer Id){
        try {
            JugadoresRepository.deleteById(Id);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

    

}
