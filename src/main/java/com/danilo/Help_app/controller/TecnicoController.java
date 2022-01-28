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

import com.danilo.Help_app.model.Tecnico;
import com.danilo.Help_app.service.TecnicoService;


@RestController
@CrossOrigin(origins = "https://dreamy-jang-746cbf.netlify.app")
@RequestMapping("/tec")
public class TecnicoController {

	@Autowired
    private TecnicoService tecnicoService;

    // Add new tecnico
    @PostMapping("/addTecnico")
    public Tecnico addTecnico(@RequestBody Tecnico tecnico) {
        return tecnicoService.addTecnico(tecnico);
    }

    // Add more than 1 tecnico
    @PostMapping("/addTecnicos")
    public List<Tecnico> addAllTecnicos(@RequestBody List<Tecnico> tecnicos) {
        return tecnicoService.addAllTecnicos(tecnicos);
    }

    // Get tecnico by Id
    @GetMapping("/getTecnicoByID/{id}")
    public Tecnico getTecnicoById(@PathVariable int id) {
        return tecnicoService.getTecnicoByID(id);
    }

    // Get tecnico by name
    @GetMapping("/getTecnicoByName/{name}")
    public  Tecnico getTecnicoByName(@PathVariable String name) {
        return  tecnicoService.getTecnicoByName(name);
    }

    // Update tecnico
    @PutMapping("/updateTecnico")
    public Tecnico updateTecnico(@RequestBody Tecnico tecnico) {
        return tecnicoService.updateTecnico(tecnico);
    }

    // Delete tecnico
    @DeleteMapping("/deleteTecnicoById/{id}")
    public boolean deleteTecnicoByID(@PathVariable int id) {
        return tecnicoService.deleteTecnicoByID(id);
    }

    // Get all tecnico
    @GetMapping("/getAll")
    public List<Tecnico> getAllTecnico() {
        return tecnicoService.getAllTecnicos();
    }

 
}
