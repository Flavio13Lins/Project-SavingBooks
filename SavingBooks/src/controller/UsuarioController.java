package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.UsuarioDAO;
import model.Usuario;

@Controller
public class UsuarioController {
	
	@RequestMapping("abrirCadUsuario")
	public String CadUsuario(Usuario cadastro) {
		UsuarioDAO testeDAO = new UsuarioDAO();
		testeDAO.inserir(cadastro);
		return "testeCadastroLivro";
	}
	
	@RequestMapping("abrirLogUsuario")
	public String LogUsuario(Usuario login) {
		System.out.println("Nick logando: " + login.getNickname());
		System.out.println(" senha logando: " + login.getSenha());
		return "testeCadastroLivro";
	}
}
