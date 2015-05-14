package com.icfernandes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {
	@Id
    @Column(name = "id", nullable = false, unique = true)
	private int id;
	@Column(name = "cartaosus", nullable = false, unique = true)
	private String cartaosus;
	@Column(name = "nome", nullable = false, unique = true)
	private String nome;
	@Column(name = "cpf", nullable = false, unique = true)
	private String cpf;
	@Column(name = "endereco", nullable = false, unique = true)
	private String endereco;
	@Column(name = "email", nullable = false, unique = true)
	private String email;
	
	private String senha;
	private String obs;
	
	public Usuario(){
		
	}
}
