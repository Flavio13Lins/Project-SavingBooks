package testes;

import dao.DAOFactory;
import dao.IUsuarioDAO;
import model.Usuario;

public class testeUsuarioDAO {
	
	public static void main(String[] args) {	
		Usuario teste = new Usuario("f@cin.ufpe.br", "flavio", "ssseeennnhhhaaa");	
		IUsuarioDAO testeDAO = DAOFactory.getUsuarioDAO();
		testeDAO.inserir(teste);
		
	}

	
}
