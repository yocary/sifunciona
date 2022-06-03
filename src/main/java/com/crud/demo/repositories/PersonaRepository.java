/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.demo.repositories;

import com.crud.demo.modelo.Persona;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona, Integer>{
    @Override
    List<Persona> findAll();
    
}
