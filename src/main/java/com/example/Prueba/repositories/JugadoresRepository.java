package com.example.Prueba.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Prueba.models.JugadorModel;

@Repository
public interface JugadoresRepository extends CrudRepository<JugadorModel, Integer>{
    //No hace falta declarar metodos estaticos porque estos metodos ya estan declarador en CrudRepository
    // fingByid()
    // fingall()
    // DeleteByid()
    
}
