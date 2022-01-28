package com.danilo.Help_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danilo.Help_app.model.Login;


public interface LoginRepository extends JpaRepository<Login, Integer> {

	Login getByName(String name);

	Login findByName(String name);

}
