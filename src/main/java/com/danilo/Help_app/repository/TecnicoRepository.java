package com.danilo.Help_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danilo.Help_app.model.Tecnico;


public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

	Tecnico getByName(String name);

	Tecnico findByName(String name);

}