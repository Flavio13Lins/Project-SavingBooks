package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Livro;

public class LivroDAO {
	
public static EntityManagerFactory sb = Persistence.createEntityManagerFactory("SavingBooks.tables");
	
	public void inserir(Livro livro){
		System.out.println("iniciou persiste livro novo");
		EntityManager b;
		System.out.println("fez entity b");
		b = sb.createEntityManager();
		b.getTransaction().begin();
		b.persist(livro);
		b.getTransaction().commit();
		System.out.println("persist ok");
	}
}
