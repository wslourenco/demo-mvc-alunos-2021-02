package com.wslourenco.curso.boot.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {

	@GetMapping("/cadastrar")
	public String Cadastrar() {
		return "/funcionario/cadastro";
	}
	
	@GetMapping("/listar")
	public String Listar() {
		return "/funcionario/lista";		
	}

}
