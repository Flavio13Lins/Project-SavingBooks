package model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBLIVRO")
public class Livro {
	/**ATRIBUTOS**/
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "livro_nome", length=35, nullable = false)
	private String nome;
	
	@Column(name = "livro_autor", length=20, nullable = false)
	private String autor;
	
	@Column(name = "livro_nota", nullable = false)
	private int nota;
	
	//@Temporal(TemporalType.DATE)
	@Column(name = "livro_cadastro", nullable = false)
	private LocalDate dataCadastro;
	
	@Column(name = "livro_check", nullable = false)
	private Boolean lido;

	@Column(name = "usuario_email", length=25 , nullable = false)
	private String usuarioEmail;
	
	/**GETTERS E SETTERS**/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	public Boolean getLido() {
		return lido;
	}
	public void setLido(Boolean lido) {
		this.lido = lido;
	}
	
	public String getUsuarioEmail() {
		return usuarioEmail;
	}
	public void setUsuarioEmail(String usuarioEmail) {
		this.usuarioEmail = usuarioEmail;
	}

	/**CONSTRUTORES**/
	public Livro() {
		super();
	}
	
	public Livro(String nome, String autor, int nota, LocalDate dataCadastro, Boolean lido, String usuarioEmail) {
		super();
		this.nome = nome;
		this.autor = autor;
		this.nota = nota;
		this.dataCadastro = dataCadastro;
		this.lido = lido;
		this.usuarioEmail = usuarioEmail;
	}
	
	public Livro(int id, String nome, String autor, int nota, LocalDate dataCadastro, Boolean lido, String usuarioEmail) {
		super();
		this.id = id;//
		this.nome = nome;
		this.autor = autor;
		this.nota = nota;
		this.dataCadastro = dataCadastro;//
		this.lido = lido;
		this.usuarioEmail = usuarioEmail;
	}
	
	
}
