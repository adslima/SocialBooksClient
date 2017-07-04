package com.algaworks.socialbooks.domain;

public class DetallhesErros {

	private String titulo;
	private Long Status;
	private Long timestamp;
	private String mensagemDesenvolvendor;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Long getStatus() {
		return Status;
	}

	public void setStatus(Long status) {
		Status = status;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getMensagemDesenvolvendor() {
		return mensagemDesenvolvendor;
	}

	public void setMensagemDesenvolvendor(String mensagemDesenvolvendor) {
		this.mensagemDesenvolvendor = mensagemDesenvolvendor;
	}

}
