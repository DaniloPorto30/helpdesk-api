package com.danilo.Help_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danilo.Help_app.model.Login;
import com.danilo.Help_app.repository.LoginRepository;



@Service
public class LoginService {

	 @Autowired
	    private LoginRepository loginRepository;

	    // Salvar
	    public Login addLogin(Login login) {
	        return loginRepository.save(login);
	    }

	    // listar
	    public List<Login> addAllLogins(List<Login> Logins) {
	        return  loginRepository.saveAll(Logins);
	    }

	    // Utualizar
	    public Login updateLogin(Login login) {
	        Login existingEMP = loginRepository.findById(login.getId()).orElse(null);
	        System.out.println(login);
	        if(existingEMP == null) {
	            System.out.println("Emp not found");
	            return  loginRepository.save(login);
	        }else  {
	            existingEMP.setName(login.getName());
	            existingEMP.setEmail(login.getEmail());
	            existingEMP.setSenha(login.getSenha());
	            
	            loginRepository.save(existingEMP);
	        }
	        return login;
	    }

	    // Deletar
	    public boolean deleteLoginByID(int id) {
	        Login existingEMP = loginRepository.getById(id);
	        if(existingEMP != null) {
	            loginRepository.deleteById(id);
	            return true;
	        }
	        return false;
	    }

	    public List<Login> getAllLogins() {
	        return loginRepository.findAll();
	    }

		public Login getLoginByID(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		public Login getLoginByName(String name) {
			// TODO Auto-generated method stub
			return null;
		}
}
