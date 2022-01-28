package com.danilo.Help_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danilo.Help_app.model.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	 Cliente getByName(String name);

	    Cliente findByName(String name);

}