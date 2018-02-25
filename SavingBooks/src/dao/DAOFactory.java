package dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
 
import dao.UsuarioDAO;
import dao.IUsuarioDAO;
 
public abstract class DAOFactory {
 
    private static final EntityManagerFactory factory;
    private static IUsuarioDAO usuarioDAO;
 
    static {
        factory = Persistence.createEntityManagerFactory("SavingBooks.tables");
    }
 
    public static IUsuarioDAO getUsuarioDAO() {
        usuarioDAO = (IUsuarioDAO) new UsuarioDAO(factory.createEntityManager());
        return usuarioDAO;
    }
 
    public static void close() {
        if (factory != null && factory.isOpen()) {
            factory.close();
        }
    }
 
}