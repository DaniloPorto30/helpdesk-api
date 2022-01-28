package com.danilo.Help_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danilo.Help_app.model.Cliente;
import com.danilo.Help_app.repository.ClienteRepository;


@Service
public class ClienteService {

	 @Autowired
	    private ClienteRepository clienteRepository;

	    // Salvar
	    public Cliente addCliente(Cliente cliente) {
	        return clienteRepository.save(cliente);
	    }

	    // listar
	    public List<Cliente> addAllClientes(List<Cliente> clientes) {
	        return  clienteRepository.saveAll(clientes);
	    }

	    // Utualizar
	    public Cliente updateCliente(Cliente cliente) {
	        Cliente existingEMP = clienteRepository.findById(cliente.getId()).orElse(null);
	        System.out.println(cliente);
	        if(existingEMP == null) {
	            System.out.println("Emp not found");
	            return  clienteRepository.save(cliente);
	        }else  {
	            existingEMP.setName(cliente.getName());
	            existingEMP.setEmail(cliente.getEmail());	 
	            existingEMP.setCpf(cliente.getCpf());
	            existingEMP.setEndereco(cliente.getEndereco());
	            existingEMP.setMobile(cliente.getMobile());	          
	            existingEMP.setImage(cliente.getImage());
	            existingEMP.setLogin(cliente.getLogin());
	            existingEMP.setSenha(cliente.getSenha());
	            existingEMP.setService(cliente.getService());
	            
	            clienteRepository.save(existingEMP);
	        }
	        return cliente;
	    }

	    // Deletar
	    public boolean deleteClienteByID(int id) {
	    	Cliente existingEMP = clienteRepository.getById(id);
	        if(existingEMP != null) {
	        	clienteRepository.deleteById(id);
	            return true;
	        }
	        return false;
	    }

	    public List<Cliente> getAllClientes() {
	        return clienteRepository.findAll();
	    }

		public Cliente getClienteByID(int id) {
			return null;
		}

		public Cliente getClienteByName(String name) {
			return null;
		}
}
