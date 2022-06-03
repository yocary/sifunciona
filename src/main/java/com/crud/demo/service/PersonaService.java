package com.crud.demo.service;

import com.crud.demo.dto.actualizarRegistroDto;
import com.crud.demo.dto.eliminarRegistroDto;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.demo.interfaceService.IpersonaService;
import com.crud.demo.interfaces.IPersona;
import com.crud.demo.modelo.Persona;
import com.crud.demo.repositories.GeneralRepository;
import com.crud.demo.repositories.PersonaRepository;
import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

@Service
public class PersonaService implements IpersonaService {

    @Autowired
    private IPersona data;

    @Autowired
    private PersonaRepository repository;

    @Autowired
    private GeneralRepository generalRepository;

    @Override
    public List<Persona> listar() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {
        return data.findById(id);
    }

    @Override
    public Persona save(Persona p) {

        final Date now = new Date();
        p.setEstado("ACTIVO");
        p.setFechaCreacion(now);

        return data.save(p);
    }

    @Override
    public Persona update(Persona p) {

        p.setFechaCreacion(p.getFechaCreacion());

        return data.save(p);
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);

    }

    @Override
    public Persona actualizar(actualizarRegistroDto dto) {
        if (!repository.existsById(dto.getId())) {

            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Error. No existe el registro a Actualizar");

        }

        Optional<Persona> persona = repository.findById(dto.getId());

        Persona datos = persona.get();

        datos.setApellido(dto.getApellido());
        datos.setName(dto.getName());
        datos.setTelefono(dto.getTelefono());
        datos.setFechaModificacion(dto.getFechaModificacion());

        return data.save(datos);
    }

    @Override
    public Persona eliminar(eliminarRegistroDto dto) {
        if (!repository.existsById(dto.getId())) {

            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Error. No existe el registro a Actualizar");

        }

        Optional<Persona> persona = repository.findById(dto.getId());

        Persona datos = persona.get();

        final Date now = new Date();

        datos.setFechaModificacion(now);

        datos.setEstado("INACTIVO");

        return data.save(datos);
    }

    @Override
    public List<Persona> obtenerRegistros() {
        List<Persona> registro = generalRepository.obtenerRegistro();
        return registro;
    }
}
