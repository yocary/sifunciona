package com.crud.demo.controller;

import com.crud.demo.dto.actualizarRegistroDto;
import com.crud.demo.dto.eliminarRegistroDto;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud.demo.interfaceService.IpersonaService;
import com.crud.demo.modelo.Persona;
import java.util.Date;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class Controlador {

    @Autowired
    private IpersonaService service;

    @GetMapping("/listar")
    public String listar(Model model) {
        List<Persona> personas = service.obtenerRegistros();
        model.addAttribute("personas", personas);
        return "index";
    }

    @GetMapping("/new")
    public String agregar(Model model) {
        model.addAttribute("persona", new Persona());
        return "form";
    }

    @PostMapping("/save")
    public String save(@Valid Persona p, Model model) {
        service.save(p);
        return "redirect:/listar";
    }

    @PostMapping("/update")
    public String update(actualizarRegistroDto dto) {

        final Date now = new Date();

        dto.setFechaModificacion(now);

        service.actualizar(dto);
        return "redirect:/listar";
    }

    @PostMapping("/eliminar")
    public String eliminarRegistro(eliminarRegistroDto dto) {

        service.eliminar(dto);
        return "redirect:/listar";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model, Persona p) {
        Optional<Persona> persona = service.listarId(id);
        model.addAttribute("persona", persona);

        return "formUpdate";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable int id, Model model, Persona p) {
        Optional<Persona> persona = service.listarId(id);
        model.addAttribute("persona", persona);

        return "formDelete";
    }

}
