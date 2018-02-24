package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Usuario;

public class UsuarioDAO2 extends DAOGenerico<Usuario> {
	
	
	//public static EntityManagerFactory sb = Persistence.createEntityManagerFactory("SavingBooks.tables");
	
	/*
	public final void inserir(Entidade objeto) {
        EntityTransaction tx = getEntityManager().getTransaction();     
        try {
            tx.begin();
            getEntityManager().persist(objeto);
            tx.commit();
            System.out.println(classePersistente.getSimpleName() + " salvo com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null && tx.isActive()){
                tx.rollback();
            }
        }
    }
	
	public void inserirgenerico(Usuario usuario){
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
	*/
	
	public UsuarioDAO2(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		EntityManagerFactory sb = Persistence.createEntityManagerFactory("SavingBooks.tables");
		System.out.println("iniciou persis usuario novo");
		EntityManager b;
		b = sb.createEntityManager();
		System.out.println("fez entity b");
		Usuario usuarionovo = new Usuario("aaaa", "bbbb", "cccc");
		System.out.println("fez usuario novo");
		DAOGenerico<Usuario> gg;
		UsuarioDAO2 um = new UsuarioDAO2(b);
		System.out.println("fez usuariodao2");
		um.inserir(usuarionovo);
		System.out.println("inserido");
	}

}
