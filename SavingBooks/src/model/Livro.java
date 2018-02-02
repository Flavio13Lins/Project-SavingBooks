package model;

import java.time.LocalDate;

public class Livro {
	/**ATRIBUTOS**/
	private int id;
	private String nome;
	private String autor;
	private int nota;
	private LocalDate dataCadastro;
	private Boolean lido;
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
