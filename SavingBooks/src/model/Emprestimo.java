package model;

import java.time.LocalDate;

public class Emprestimo {
	/**ATRIBUTOS**/
	private int id;
	private LocalDate dataEmprestimo;
	private LocalDate dataDevolucao;
	private String pessoa;
	private int livroId;
	
	/**GETTERS E SETTERS**/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	
	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	public String getPessoa() {
		return pessoa;
	}
	public void setPessoa(String pessoa) {
		this.pessoa = pessoa;
	}
	
	public int getLivroId() {
		return livroId;
	}
	public void setLivroId(int livroId) {
		this.livroId = livroId;
	}
	
	/**CONSTRUTORES**/
	public Emprestimo() {
		super();
	}
	
	public Emprestimo(int id, LocalDate dataEmprestimo, LocalDate dataDevolucao, String pessoa, int livroId) {
		super();
		this.id = id;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
		this.pessoa = pessoa;
		this.livroId = livroId;
	}
	
	
}
