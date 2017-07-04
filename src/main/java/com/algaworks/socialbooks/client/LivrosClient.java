package com.algaworks.socialbooks.client;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.algaworks.socialbooks.domain.Livros;

public class LivrosClient {

	public List<Livros> listar() {

		RestTemplate restTamplate = new RestTemplate();

		RequestEntity<Void> request = RequestEntity.get(URI.create("http://localhost:8080/livros"))
				.header("Authorization", "Basic dGVzdGU6dGVzdGU=").build();

		ResponseEntity<Livros[]> response = restTamplate.exchange(request, Livros[].class);

		return Arrays.asList(response.getBody());

	}

	public String Salvar(Livros livro) {

		RestTemplate restTamplate = new RestTemplate();

		RequestEntity<Livros> request = RequestEntity.post(URI.create("http://localhost:8080/livros"))
				.header("Authorization", "Basic dGVzdGU6dGVzdGU=").body(livro);

		ResponseEntity<Void> response = restTamplate.exchange(request, Void.class);

		return response.getHeaders().getLocation().toString();
	}
}
