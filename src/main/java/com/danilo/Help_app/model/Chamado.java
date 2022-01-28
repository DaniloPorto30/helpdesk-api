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
public class Chamado {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String email;
	private String image;
	private String descricao;
	private int mobile;
	private int cpf;
	private int endereco;
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

	public String getDescricao() {
		return descricao;
	}
	public int getMobile() {
		return mobile;
	}
	public int getCpf() {
		return cpf;
	}
	public int getEndereco() {
		return endereco;
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
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public void setEndereco(int endereco) {
		this.endereco = endereco;
	}
	
}
