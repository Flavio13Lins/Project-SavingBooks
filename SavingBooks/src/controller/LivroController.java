package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import model.Livro;

@Controller
public class LivroController {
	
	@RequestMapping("adicionarLivro")
	public String addLivro(Livro livro) {
		System.out.println("Titulo do livro: " + livro.getNome());
		System.out.println(" Already e nota: "+ livro.getLido() +" "+ livro.getNota());
		return "testeCadastroLivro";
	}
}
