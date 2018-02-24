package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class UsuarioDAO {
	
	public static EntityManagerFactory sb = Persistence.createEntityManagerFactory("SavingBooks.tables");
	
	public void inserir(Usuario usuario){
		//Usuario novo = usuario;
		System.out.println("iniciou persis usuario novo");
		EntityManager b;
		System.out.println("fez entity b");
		b = sb.createEntityManager();
		b.getTransaction().begin();
		b.persist(usuario);
		b.getTransaction().commit();
		System.out.println("persist ok");
	}
	
	public static void main(String[] args) {
		EntityManagerFactory sb = Persistence.createEntityManagerFactory("SavingBooks.tables");
		System.out.println("iniciou persis usuario novo");
		EntityManager b;
		b = sb.createEntityManager();
		System.out.println("fez entity b");
		Usuario usuarionovo = new Usuario("aaaa", "bbbb", "cccc");
		System.out.println("fez usuario novo");
		//DAOGenerico<Usuario> gg = UsuarioDAO2;
		//UsuarioDAO um = new UsuarioDAO2(b);
		System.out.println("fez usuariodao2");
		//um.inserir(usuarionovo);
		System.out.println("inserido");
	}
	
	
}
