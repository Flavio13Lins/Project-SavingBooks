package testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.UsuarioDAO;
import model.Usuario;

public class TesteGenericoDAO {
	
	public static void main(String[] args) {
		EntityManagerFactory sb = Persistence.createEntityManagerFactory("SavingBooks.tables");
		System.out.println("iniciou persis usuario novo");
		EntityManager b;
		b = sb.createEntityManager();
		System.out.println("fez entity b");
		Usuario usuarionovo = new Usuario("aaaa", "bbbb", "cccc");
		System.out.println("fez usuario novo");
		UsuarioDAO um = new UsuarioDAO(b);
		System.out.println("fez usuariodao2");
		um.inserir(usuarionovo);
		System.out.println("inserido");
	}
	
}
