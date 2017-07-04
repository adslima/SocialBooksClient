package com.algaworks.socialbooks.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author ksa
 *
 */

public class Comentarios {

	/**
	 * 
	 */
	private Long id;
	/**
	 * 
	 */
	private String texto;
	/**
	 * 
	 */
	private String usuario;
	/**
	 * 
	 */
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date data;
	/**
	 * 
	 */
	private Livros livros;

	public Livros getLivros() {
		return livros;
	}

	public void setLivros(Livros livros) {
		this.livros = livros;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
