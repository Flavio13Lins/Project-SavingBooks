package controller;

import model.Livro;
import model.Usuario;

public class Sistema {

	public void cadastrarUsuario(Usuario usuario){
		System.out.println("Usuario cadastrado: " + usuario.getEmail());
	}
	
	public boolean efetuarLogin(String nickname, String senha){
		System.out.println("Login realizado: " + nickname + ", " + senha);
		return true;
	}
	
	public void cadastrarLivro(Livro livro){
		System.out.println("Livro cadastrado: " + livro.getNome());
	}
}
