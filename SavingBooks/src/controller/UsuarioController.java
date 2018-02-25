package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.IUsuarioDAO;
import model.Usuario;
import dao.DAOFactory;

@Controller
public class UsuarioController {
	
	@RequestMapping("cad-livro")
	public String CadUsuario(Usuario cadastro) {
		IUsuarioDAO testeDAO = DAOFactory.getUsuarioDAO();
		testeDAO.inserir(cadastro);
		return "testeCadastroLivro";
	}
	
	@RequestMapping("abrirCadUser")
	public String abrirCadUser(){
		System.out.println("Abrir Cadastrar Usuario");
		return "testeCadastroUsuario";
	}
	
	@RequestMapping("listarUsers")
	public String listarUsers(){
		System.out.println("Abrir lista de Usuarios");
		return "listaUsuario";
	}
	
	@RequestMapping("criandoOb")
	public String CriandoOB(Usuario novousuario) {
		IUsuarioDAO uDAO = DAOFactory.getUsuarioDAO();
		uDAO.inserir(novousuario);
		return "creatingobject";
	}
	
	@RequestMapping("objetocriado")
	public String ObjetoCriado() {
		return "objectcreated";
	}
	
	@RequestMapping("abrirLogUsuario")
	public String LogUsuario(Usuario login) {
		System.out.println("Nick logando: " + login.getNickname());
		System.out.println(" senha logando: " + login.getSenha());
		return "testeCadastroLivro";
	}
}
