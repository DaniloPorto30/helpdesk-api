package com.danilo.Help_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danilo.Help_app.model.Tecnico;
import com.danilo.Help_app.repository.TecnicoRepository;


@Service
public class TecnicoService {

	 @Autowired
	    private TecnicoRepository tecnicoRepository;

	    // Salvar
	    public Tecnico addTecnico(Tecnico tecnico) {
	        return tecnicoRepository.save(tecnico);
	    }

	    // listar
	    public List<Tecnico> addAllTecnicos(List<Tecnico> tecnicos) {
	        return  tecnicoRepository.saveAll(tecnicos);
	    }
	    // Utualizar
	    public Tecnico updateTecnico(Tecnico tecnico) {
	        Tecnico existingEMP = tecnicoRepository.findById(tecnico.getId()).orElse(null);
	        System.out.println(tecnico);
	        if(existingEMP == null) {
	            System.out.println("Emp not found");
	            return  tecnicoRepository.save(tecnico);
	        }else  {
	            existingEMP.setName(tecnico.getName());
	            existingEMP.setEmail(tecnico.getEmail());
	            existingEMP.setSalary(tecnico.getSalary());
	            existingEMP.setCpf(tecnico.getCpf());
	            existingEMP.setEndereco(tecnico.getEndereco());
	            existingEMP.setMobile(tecnico.getMobile());
	            existingEMP.setIdade(tecnico.getIdade());
	            existingEMP.setImage(tecnico.getImage());
	            existingEMP.setLogin(tecnico.getLogin());
	            existingEMP.setSenha(tecnico.getSenha());
	            existingEMP.setService(tecnico.getService());
	            
	            tecnicoRepository.save(existingEMP);
	        }
	        return tecnico;
	    }

	    // Deletar
	    public boolean deleteTecnicoByID(int id) {
	        Tecnico existingEMP = tecnicoRepository.getById(id);
	        if(existingEMP != null) {
	            tecnicoRepository.deleteById(id);
	            return true;
	        }
	        return false;
	    }

	    public List<Tecnico> getAllTecnicos() {		
			return tecnicoRepository.findAll();
		}

		public Tecnico getTecnicoByID(int id) {			
			return null;
		}

		public Tecnico getTecnicoByName(String name) {
			return null;
		}

		
}
