package controller;

import java.time.LocalDate;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Emprestimo;
import model.Livro;
import model.Usuario;

public class Geratabelas {
	/**ENTITYMANAGER-SAVINGBOOKS**/
	public static EntityManagerFactory sb = Persistence.createEntityManagerFactory("SavingBooks.tables");
	
	/**NUMERO ALEATORIO**/
	public static Random numrand = new Random();
	
	/**MAIN**/
	public static void main(String[] args) {      
        System.out.println("fez entity sb");
        
		Usuario us1 = new Usuario("o@emai", "onic", "osen"), 
				usk = new Usuario("k@k", "k", "kkk"),
				us2 = new Usuario("o@o", "oo", "osen");
		
		LocalDate datatual = LocalDate.now(), 
				  datanasc = LocalDate.of(1995, 2, 20), 
				  datalea = LocalDate.of(2000, 9, 13),
				  datadps = LocalDate.of(2015, 10, numrand.nextInt(27)+1),
				  datarand = LocalDate.of(2010, 10, numrand.nextInt(27)+1);
		
		Livro liv1 = new Livro("liv1", "eumsm", 2, datalea, true, usk.getEmail()),
			  livdo1leu = new Livro("abc", "erasm", 4, datanasc, true, us1.getEmail()),
			  livtl = new Livro("mero", "bobos \\n0", 9, datatual, true, usk.getEmail());
		
		Emprestimo emprestkto1 = new Emprestimo(datanasc, datatual, us1.getNickname(), liv1),
				emprest1tok = new Emprestimo(datarand, datadps, usk.getNickname(), livdo1leu),
				empresnovo = new Emprestimo(datalea, datatual, us2.getNickname(), liv1);
		
		System.out.println("variaveis ok");

        fazusUarioTesteqlqr();
        System.out.println("completou usuario");
        fazLivroTesteqlqr();
        System.out.println("completou livro");
        fazEmprestimoTesteqlqr();
        System.out.println("completou emprestimo");
        
        persistirUsuario(usk);
        persistirUsuario(us1);
        persistirUsuario(us2);
        System.out.println("persist nos usuarios ok");
        
        persistirLivroDeUsuarioLib(usk, liv1);
        System.out.println("livro do usk");
        persistirLivroDeUsuarioLib(us1, livtl);
        persistirLivroDeUsuarioLib(us1, livdo1leu);
        System.out.println("livros do us1");
        
        persistirEmprestimo(emprestkto1);
        System.out.println("teste ok novoemprestimo kto1");
        
        persistirEmprestimo(emprest1tok);
        System.out.println("teste ok novoemprestimo 1tok");
        
        persistirEmprestimo(empresnovo);
        System.out.println("teste ok novoemprestimo 2 kto1");
        
        System.out.println("tentando consulta");
        consultarUsuario(1);
        System.out.println("feita consulta");
        
        System.out.println("tentando remover ");
        removerUsuario(2);
        System.out.println("feita remoçao");
        
        System.out.println("tentando alterar para emeile@... ");
        alterarEmailUsuario(1, "emeile@blabal");
        System.out.println("feita alteraçao");
        
        sb.close();
        System.out.println("fechou");
        
    }
	
	/**FUNÇÕES**///Teste de criaçao simples
	public static void fazusUarioTesteqlqr() {
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
	
	public static void fazLivroTesteqlqr() {
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
	
	public static void fazEmprestimoTesteqlqr() {
		System.out.println("iniciou emp a");
		EntityManager b;
		System.out.println("fez entity b");
		LocalDate x = LocalDate.now(), y = LocalDate.of(1995, 2, 2);
		Livro a2 = new Livro("livro2", "autor2", 3, x, false, "falsksaks@kadksdk.com");
		System.out.println("criou livro a2 e datas");
		b = sb.createEntityManager();
		b.getTransaction().begin();
		b.persist(a2);
		b.getTransaction().commit();
		System.out.println("persistindo livro");
		Emprestimo c = new Emprestimo(y, x, "pessoacomlivro", a2);
		System.out.println("criou emprestimo");
		b = sb.createEntityManager();
		b.getTransaction().begin();
		b.persist(c);
		b.getTransaction().commit();
		b.close();
	}
	
	//Teste de criaçao com parametros
	public static void persistirEmprestimo(Emprestimo e) {
		Emprestimo novo = e;
		System.out.println("iniciou emp e com livro do e");
		EntityManager b;
		System.out.println("fez entity b");
		b = sb.createEntityManager();
		b.getTransaction().begin();
		b.persist(novo);
		b.getTransaction().commit();
		b.close();
		System.out.println("fez persist em e");
	}
	
	public static void persistirUsuario(Usuario usuario) {
		Usuario novo = usuario;
		System.out.println("iniciou persis usuario novo");
		EntityManager b;
		System.out.println("fez entity b");
		b = sb.createEntityManager();
		b.getTransaction().begin();
		b.persist(novo);
		b.getTransaction().commit();
		System.out.println("persist ok");
	}
	
	public static void persistirLivroDeUsuarioLib(Usuario u, Livro l) {
		Livro novo = l;
		novo.setUsuarioEmail(u.getEmail());
		System.out.println("iniciou usu u com livro l");
		EntityManager b;
		System.out.println("fez entity b");
		b = sb.createEntityManager();
		b.getTransaction().begin();
		b.persist(novo);
		b.getTransaction().commit();
		b.close();
		System.out.println("fez persist no livro em nova lib");
	}
	
	public static void consultarUsuario(int numb) {
		System.out.println("consulta do usuario");
		EntityManager b;
		System.out.println("fez entity b");
		b = sb.createEntityManager();
		System.out.println("criando parametro");
		Usuario u = b.find(Usuario.class, numb);
		System.out.println("pesquisa feita pelo "+ numb);
		if (u != null){
			System.out.println(u.getNickname()+" "+u.getEmail()+" "+u.getSenha());	
		} else {
			System.out.println("usuario nao encontrado");
		}
		b.close();
	}
	
	public static void alterarEmailUsuario(int numb, String novoemail) {
		System.out.println("consulta do usuario");
		EntityManager b;
		System.out.println("fez entity b");
		b = sb.createEntityManager();
		System.out.println("criando parametro");
		Usuario u = b.find(Usuario.class, numb);
		System.out.println("pesquisa feita pelo "+ numb);
		if (u != null){
			System.out.println("ante-> "+u.getNickname()+" "+u.getEmail()+" "+u.getSenha());	
		} else {
			System.out.println("usuario nao encontrado");
		}
		try {
			u.setEmail(novoemail);//alterando email
			System.out.println("alterando agr-> "+u.getNickname()+" "+u.getEmail()+" "+u.getSenha());
			b.getTransaction().begin();
			// fazendo merge
			u = b.merge(u);
			b.getTransaction().commit();
			
		} 
		catch (Exception e){
			e.printStackTrace();
		} 
		finally {
			b.close();
		}
	}
	
	public static void alterarNickUsuario(int numb, String novonick) {
		System.out.println("consulta do usuario");
		EntityManager b;
		System.out.println("fez entity b");
		b = sb.createEntityManager();
		System.out.println("criando parametro");
		Usuario u = b.find(Usuario.class, numb);
		System.out.println("pesquisa feita pelo "+ numb);
		if (u != null){
			System.out.println("ante-> "+u.getNickname()+" "+u.getEmail()+" "+u.getSenha());	
		} else {
			System.out.println("usuario nao encontrado");
		}
		try {
			u.setNickname(novonick);//alterando email
			System.out.println("alterando agr-> "+u.getNickname()+" "+u.getEmail()+" "+u.getSenha());
			b.getTransaction().begin();
			// fazendo merge
			u = b.merge(u);
			b.getTransaction().commit();
			
		} 
		catch (Exception e){
			e.printStackTrace();
		} 
		finally {
			b.close();
		}
	}
	
	public static void alterarSenhaUsuario(int numb, String novasenha) {
		System.out.println("consulta do usuario");
		EntityManager b;
		System.out.println("fez entity b");
		b = sb.createEntityManager();
		System.out.println("criando parametro");
		Usuario u = b.find(Usuario.class, numb);
		System.out.println("pesquisa feita pelo "+ numb);
		if (u != null){
			System.out.println("ante-> "+u.getNickname()+" "+u.getEmail()+" "+u.getSenha());	
		} else {
			System.out.println("usuario nao encontrado");
		}
		try {
			u.setSenha(novasenha);//alterando email
			System.out.println("alterando agr-> "+u.getNickname()+" "+u.getEmail()+" "+u.getSenha());
			b.getTransaction().begin();
			// fazendo merge
			u = b.merge(u);
			b.getTransaction().commit();
			
		} 
		catch (Exception e){
			e.printStackTrace();
		} 
		finally {
			b.close();
		}
	}
	
	public static void removerUsuario(int numb) {
		try {
			// Consultar objeto
			EntityManager b;
			System.out.println("fez entity b");
			b = sb.createEntityManager();
			Usuario u = b.find(Usuario.class, numb);              
			System.out.println("encontrado para remoçao agr-> "+u.getNickname()+" "+u.getEmail()+" "+u.getSenha());
			// Remover objeto
			b.getTransaction().begin();
			b.remove(u);
			b.getTransaction().commit();
			b.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			System.out.println("removivo");
			
		}
	}
	
	public static void consultarLivro() {
		
	}
	
	public static void alterarLivro() {
		
	}
	
	public static void removerLivro() {
		
	}
}
