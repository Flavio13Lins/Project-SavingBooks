package controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Geratabelas {

	public static void main(String[] args) {
		System.out.println("iniciou");
        EntityManagerFactory em = Persistence.createEntityManagerFactory("SavingBooks.tables");
        System.out.println("fez entity");
        em.close();
        System.out.println("fechou");
    }
	
}
