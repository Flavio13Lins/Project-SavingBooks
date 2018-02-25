package dao;

import javax.persistence.EntityManager;
import model.Usuario;

public class UsuarioDAO extends DAOGenerico<Usuario> implements IUsuarioDAO{
	
	public UsuarioDAO(EntityManager em) {
		super(em);
	}
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
	
	

}
