package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello") // Indica o endereço do recurso (localhost:8080/hello)
public class HelloController {

	@GetMapping
	public StringBuilder helloWorld() {
		StringBuilder sb = new StringBuilder();
		sb.append("<div><h1>Hello World!</h1></div>");
		return sb;
	}
	
	@GetMapping("/listar")
	public String listaGeneration() {
		StringBuilder sb = new StringBuilder();
		sb.append("<h1>Lista de BSM's da Generation Brasil: </h1>");
		sb.append("<ul>\r\n"
				+ "	<li>Mentalidade de Crescimento\r\n"
				+ "	<li>Persistência\r\n"
				+ "	<li>Responsabilidade Pessoal\r\n"
				+ "	<li>Orientação ao Futuro\r\n"
				+ "	<li>Comunicação\r\n"
				+ "	<li>Orientação ao Detalhe\r\n"
				+ "	<li>Proatividade\r\n"
				+ "	<li>Trabalho em Equipe\r\n"
				+ "<ul>");
		return sb.toString();
		
	}
	
	@GetMapping("/objetivos")
	public String objetivosSemana() {
		StringBuilder sb = new StringBuilder();
		sb.append("<h1>Objetivos da Semana: </h1>");
		sb.append("<ul>\r\n"
				+ "	<li>Mentalidade de Crescimento\r\n"
				+ "	<li>Persistência\r\n"
				+ "	<li>Comunicação\r\n"
				+ "	<li>Proatividade\r\n"
				+ "	<li>Trabalho em Equipe\r\n"
				+ "<ul>");
		return sb.toString();
	}
}