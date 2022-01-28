package com.danilo.Help_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danilo.Help_app.model.Chamado;
import com.danilo.Help_app.service.ChamadoService;


@RestController
@CrossOrigin(origins = "https://helpdesk-app.netlify.app")
@RequestMapping("/cha")
public class ChamadoController {

	@Autowired
    private ChamadoService chamadoService;

    // Add new chamado
    @PostMapping("/addChamado")
    public Chamado addChamado(@RequestBody Chamado chamado) {
        return chamadoService.addChamado(chamado);
    }

    // Add more than 1 chamado
    @PostMapping("/addChamados")
    public List<Chamado> addAllChamados(@RequestBody List<Chamado> chamados) {
        return chamadoService.addAllChamados(chamados);
    }

    // Get chamado by Id
    @GetMapping("/getChamadoByID/{id}")
    public Chamado getChamadoById(@PathVariable int id) {
        return chamadoService.getChamadoByID(id);
    }

    // Get chamado by name
    @GetMapping("/getChamadoByName/{name}")
    public  Chamado getChamadoByName(@PathVariable String name) {
        return  chamadoService.getChamadoByName(name);
    }

    // Update chamado
    @PutMapping("/updateChamado")
    public Chamado updateChamado(@RequestBody Chamado chamado) {
        return chamadoService.updateChamado(chamado);
    }

    // Delete chamado
    @DeleteMapping("/deleteChamadoById/{id}")
    public boolean deleteChamadoByID(@PathVariable int id) {
        return chamadoService.deleteChamadoByID(id);
    }

    // Get all chamado
    @GetMapping("/getAll")
    public List<Chamado> getAllChamado() {
        return chamadoService.getAllChamados();
    }
}
