package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import model.Usuario;

@Controller
public class UsuarioController {
	
	@RequestMapping("abrirCadUsuario")
	public String CadUsuario(Usuario cadastro) {
		System.out.println("Email cadastrando: " + cadastro.getEmail());
		System.out.println(" senha logando: " + cadastro.getSenha());
		return "testeCadastroLivro";
	}
	
	@RequestMapping("abrirLogUsuario")
	public String LogUsuario(Usuario login) {
		System.out.println("Nick logando: " + login.getNickname());
		System.out.println(" senha logando: " + login.getSenha());
		return "testeCadastroLivro";
	}
}
