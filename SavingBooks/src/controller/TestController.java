package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("chamarTest2")
	public String test2(){
		System.out.println("Método ok!");
		return "teste2";
	}
	
	@RequestMapping("abrirTeste1")
	public String abrirTeste1(){
		System.out.println("Abrindo teste1");
		return "teste1";
	}
	
	@RequestMapping("abrirIndex")
	public String abrirIndex(){
		System.out.println("Página inicial");
		return "index";
	}
	
	
	@RequestMapping("abrirCadBook")
	public String abrirCadBook(){
		System.out.println("Indo para Cadastrar Livro");
		return "testeCadastroLivro";
	}
	
}
