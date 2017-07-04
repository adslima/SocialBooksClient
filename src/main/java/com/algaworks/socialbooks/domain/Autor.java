package com.algaworks.socialbooks.domain;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author andrews.lima
 *
 */

public class Autor {

	/**
	 * Atributo id
	 */
	
	private Long id;
	/**
	 * Atributo nome do autor
	 */
	
	private String nome;
	/**
	 * Atributo data de nascimento
	 */
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date nascimento;
	/**
	 * Atributo nascionalidade
	 */

	private String nacionalidade;
	/**
	 * Atributo do tipo Lista livros.
	 */
	private List<Livros> livros;

	/**
	 * Construtor
	 */
	public Autor() {
	}

	/**
	 * Construtor
	 * 
	 * @param id
	 * @param nome
	 * @param nascimento
	 * @param nacionalidade
	 * @param livros
	 */
	public Autor(Long id, String nome, Date nascimento, String nacionalidade, List<Livros> livros) {
		super();
		this.id = id;
		this.nome = nome;
		this.nascimento = nascimento;
		this.nacionalidade = nacionalidade;
		this.livros = livros;
	}

	/**
	 * 
	 * @return
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 */

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * 
	 * @return
	 */
	public Date getNascimento() {
		return nascimento;
	}

	/**
	 * 
	 * @param nascimento
	 */
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	/**
	 * 
	 * @return
	 */
	public String getNacionalidade() {
		return nacionalidade;
	}

	/**
	 * 
	 * @param nacionalidade
	 */
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	/**
	 * 
	 * @return
	 */
	public List<Livros> getLivros() {
		return livros;
	}

	/**
	 * 
	 * @param livros
	 */
	public void setLivros(List<Livros> livros) {
		this.livros = livros;
	}

}
