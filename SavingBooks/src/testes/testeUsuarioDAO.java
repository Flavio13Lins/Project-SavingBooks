package testes;

import dao.UsuarioDAO;
import model.Usuario;

public class testeUsuarioDAO {
	
	public static void main(String[] args) {
		Usuario teste = new Usuario("f@cin.ufpe.br", "flavio", "ssseeennnhhhaaa");
		UsuarioDAO testeDAO = new UsuarioDAO();
		testeDAO.inserir(teste);
	}

	
}
