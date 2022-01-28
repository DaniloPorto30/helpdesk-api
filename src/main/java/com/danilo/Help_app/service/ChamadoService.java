package com.danilo.Help_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danilo.Help_app.model.Chamado;
import com.danilo.Help_app.repository.ChamadoRepository;


@Service
public class ChamadoService {

	 @Autowired
	    private ChamadoRepository chamadoRepository;

	    // Salvar
	    public Chamado addChamado(Chamado chamado) {
	        return chamadoRepository.save(chamado);
	    }

	    // listar
	    public List<Chamado> addAllChamados(List<Chamado> chamados) {
	        return  chamadoRepository.saveAll(chamados);
	    }

	    // Utualizar
	    public Chamado updateChamado(Chamado chamado) {
	        Chamado existingEMP = chamadoRepository.findById(chamado.getId()).orElse(null);
	        System.out.println(chamado);
	        if(existingEMP == null) {
	            System.out.println("Emp not found");
	            return  chamadoRepository.save(chamado);
	        }else  {
	            existingEMP.setName(chamado.getName());
	            existingEMP.setEmail(chamado.getEmail());
	            existingEMP.setCpf(chamado.getCpf());
	            existingEMP.setEndereco(chamado.getEndereco());
	            existingEMP.setMobile(chamado.getMobile());	      
	            existingEMP.setImage(chamado.getImage());	     
	            existingEMP.setDescricao(chamado.getDescricao());     
	            
	            chamadoRepository.save(existingEMP);
	        }
	        return chamado;
	    }

	    // Deletar
	    public boolean deleteChamadoByID(int id) {
	        Chamado existingEMP = chamadoRepository.getById(id);
	        if(existingEMP != null) {
	            chamadoRepository.deleteById(id);
	            return true;
	        }
	        return false;
	    }

	    public List<Chamado> getAllChamados() {
	        return chamadoRepository.findAll();
	    }

		public Chamado getChamadoByID(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		public Chamado getChamadoByName(String name) {
			// TODO Auto-generated method stub
			return null;
		}
}
