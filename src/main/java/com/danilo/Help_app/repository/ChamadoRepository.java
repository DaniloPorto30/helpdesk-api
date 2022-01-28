package com.danilo.Help_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danilo.Help_app.model.Chamado;


public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

	 Chamado getByName(String name);

	    Chamado findByName(String name);

}