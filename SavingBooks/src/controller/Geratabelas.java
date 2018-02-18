package controller;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Emprestimo;
import model.Livro;
import model.Usuario;

public class Geratabelas {
	/**ENTITYMANAGER-SAVINGBOOKS**/
	public static EntityManagerFactory sb = Persistence.createEntityManagerFactory("SavingBooks.tables");
	
	/**MAIN**/
	public static void main(String[] args) {        
        System.out.println("fez entity sb");
        fazusuario();
        System.out.println("completou usuario");
        fazlivro();
        System.out.println("completou livro");
        fazemprestimo();
        System.out.println("completou emprestimo");
        sb.close();
        System.out.println("fechou");
        
    }
	
	/**FUNÇÕES**/
	public static void fazusuario() {
		System.out.println("iniciou usu a");
		EntityManager b;
		System.out.println("fez entity b");
		Usuario cara = new Usuario("flaviolins@blabla.com", "flavio", "1234");
		System.out.println("criou usuario");
		b = sb.createEntityManager();
		b.getTransaction().begin();
		b.persist(cara);
		b.getTransaction().commit();
		b.close();
	}
	
	public static void fazlivro() {
		System.out.println("iniciou liv a");
		EntityManager b;
		System.out.println("fez entity b");
		LocalDate x = LocalDate.now();
		Livro a1 = new Livro("livro1", "autor1", 4, x, false, "falsksaks@kadksdk.com");
		System.out.println("criou livro a1");
		b = sb.createEntityManager();
		b.getTransaction().begin();
		b.persist(a1);
		b.getTransaction().commit();
		b.close();
	}
	
	public static void fazemprestimo() {
		System.out.println("iniciou emp a");
		EntityManager b;
		System.out.println("fez entity b");
		LocalDate x = LocalDate.now(), y = LocalDate.of(1995, 2, 2);
		Livro a2 = new Livro("livro2", "autor2", 3, x, false, "falsksaks@kadksdk.com");
		System.out.println("criou livro a2 e datas");
		Emprestimo c = new Emprestimo(y, x, "pessoacomlivro", a2);
		System.out.println("criou emprestimo");
		b = sb.createEntityManager();
		b.getTransaction().begin();
		b.persist(c);
		b.getTransaction().commit();
		b.close();
		
		
	}
}
