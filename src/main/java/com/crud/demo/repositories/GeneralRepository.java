/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.demo.repositories;

import com.crud.demo.modelo.Persona;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

@Repository
public class GeneralRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Persona> obtenerRegistro() {
        String query = "select * from bdcrud.persona where estado ='ACTIVO' order by id asc";
        Query q = entityManager.createNativeQuery(query, Persona.class);
        return q.getResultList();
    }
}
