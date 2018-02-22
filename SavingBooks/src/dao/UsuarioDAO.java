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
	
	
}
