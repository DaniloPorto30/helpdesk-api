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

import com.danilo.Help_app.model.Cliente;
import com.danilo.Help_app.service.ClienteService;


@RestController
@CrossOrigin(origins = "https://helpdesk-app.netlify.app")
@RequestMapping("/cli")
public class ClienteController {

	@Autowired
    private ClienteService clienteService;

    // Add new cliente
    @PostMapping("/addCliente")
    public Cliente addCliente(@RequestBody Cliente cliente) {
        return clienteService.addCliente(cliente);
    }

    // Add more than 1 cliente
    @PostMapping("/addClientes")
    public List<Cliente> addAllClientes(@RequestBody List<Cliente> clientes) {
        return clienteService.addAllClientes(clientes);
    }

    // Get cliente by Id
    @GetMapping("/getClienteByID/{id}")
    public Cliente getClienteById(@PathVariable int id) {
        return clienteService.getClienteByID(id);
    }

    // Get cliente by name
    @GetMapping("/getClienteByName/{name}")
    public  Cliente getClienteByName(@PathVariable String name) {
        return  clienteService.getClienteByName(name);
    }

    // Update cliente
    @PutMapping("/updateCliente")
    public Cliente updateCliente(@RequestBody Cliente cliente) {
        return clienteService.updateCliente(cliente);
    }

    // Delete cliente
    @DeleteMapping("/deleteClienteById/{id}")
    public boolean deleteClienteoByID(@PathVariable int id) {
        return clienteService.deleteClienteByID(id);
    }

    // Get all cliente
    @GetMapping("/getAll")
    public List<Cliente> getAllCliente() {
        return clienteService.getAllClientes();
    }
}
