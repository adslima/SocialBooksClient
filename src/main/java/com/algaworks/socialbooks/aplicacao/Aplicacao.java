package com.algaworks.socialbooks.aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.algaworks.socialbooks.client.LivrosClient;
import com.algaworks.socialbooks.domain.Livros;

public class Aplicacao {

	public static void main(String[] args) throws ParseException {

		LivrosClient client = new LivrosClient();

		List<Livros> listaLivros = client.listar();

		for (Livros livro : listaLivros) {

			System.out.println("Livro: " + livro.getNome());

		}
		Livros livro = new Livros();

		livro.setNome("Curso Rest Aplicado");

		SimpleDateFormat publicacao = new SimpleDateFormat("dd/MM/yyyy");
		livro.setPublicacao(publicacao.parse("16/10/1983"));
		livro.setResumo("Muito bom o livro");
		livro.setEditora("AlgaWorks");

		String localization = client.Salvar(livro);

		System.out.println(localization);

	}

}
