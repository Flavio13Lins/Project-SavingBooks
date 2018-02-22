package controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.LivroDAO;
import model.Livro;

@Controller
public class LivroController {
	
	@RequestMapping("adicionarLivro")
	public String addLivro(Livro livro) {
		LivroDAO testeDAO = new LivroDAO();
		livro.setDataCadastro(LocalDate.now());//data do cadastro do livro
		livro.setUsuario(1);//chave estrangeira
		testeDAO.inserir(livro);
		//System.out.println("Titulo do livro: " + livro.getNome());
		//System.out.println(" Already e nota: "+ livro.getLido() +" "+ livro.getNota());
		return "testeCadastroLivro";
	}
}
