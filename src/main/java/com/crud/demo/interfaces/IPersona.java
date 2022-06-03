package com.crud.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.demo.modelo.Persona;
import java.util.List;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer>{
    @Override
    List<Persona> findAll();
}
