package controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.LivroDAO;
import model.Livro;
import model.Usuario;

@Controller
public class LivroController {
	
	@RequestMapping("adicionarLivro")
	public String addLivro(Livro livro) {
		LivroDAO testeDAO = new LivroDAO();
		Usuario u = new Usuario();
		livro.setDataCadastro(LocalDate.now());//data do cadastro do livro
		livro.setUsuario(u);//chave estrangeira
		testeDAO.inserir(livro);
		return "testeCadastroLivro";
	}
}
