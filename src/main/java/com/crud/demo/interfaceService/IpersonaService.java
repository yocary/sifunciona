package com.crud.demo.interfaceService;

import com.crud.demo.dto.actualizarRegistroDto;
import com.crud.demo.dto.eliminarRegistroDto;
import java.util.List;
import java.util.Optional;

import com.crud.demo.modelo.Persona;

public interface IpersonaService {
	
	public List<Persona>listar();
	public Optional<Persona>listarId(int id);
	public Persona save(Persona p);
        public Persona update(Persona p);
	public void delete(int id);
	public Persona actualizar(actualizarRegistroDto dto);
        public Persona eliminar(eliminarRegistroDto dto);
        public List<Persona> obtenerRegistros();

}
