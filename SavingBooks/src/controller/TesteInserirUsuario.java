package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class TesteInserirUsuario {

	
    public static EntityManagerFactory a = Persistence.createEntityManagerFactory("SavingBooks.tables");
    //em.close();
	
	public static void main(String[] args) {
		System.out.println("iniciou a");
		EntityManager b;
		System.out.println("fez entity b");
		Usuario cara = new Usuario("flaviolins@blabla.com", "flavio", "1234");
		System.out.println("criou usuario");
		b = a.createEntityManager();
		b.getTransaction().begin();
		b.persist(cara);
		b.getTransaction().commit();
		b.close();
	}
	
}
