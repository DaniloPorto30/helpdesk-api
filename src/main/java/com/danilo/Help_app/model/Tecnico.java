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
public class Tecnico {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String email;
	private String image;
	private String senha;
	private String login;
	private String service;
	private int mobile;
	private int cpf;
	private String endereco;
	private int salary;
	private int idade;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getImage() {
		return image;
	}
	public String getSenha() {
		return senha;
	}
	public String getLogin() {
		return login;
	}
	public String getService() {
		return service;
	}
	public int getMobile() {
		return mobile;
	}
	public int getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public int getSalary() {
		return salary;
	}
	public int getIdade() {
		return idade;
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
	public void setImage(String image) {
		this.image = image;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setService(String service) {
		this.service = service;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
