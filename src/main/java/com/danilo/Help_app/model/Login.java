package com.danilo.Help_app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Login {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String email;
	private String senha;

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getSenha() {
		return senha;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
