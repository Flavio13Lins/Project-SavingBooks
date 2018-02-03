package model;

import java.time.LocalDate;

public class Emprestimo {
	/**ATRIBUTOS**/
	private int id;
	private LocalDate dataEmprestimo;
	private LocalDate dataDevolucao;
	private String pessoa;
	private Livro livro;
	
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
	
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	/**CONSTRUTORES**/
	public Emprestimo() {
		super();
	}
	
	public Emprestimo(int id, LocalDate dataEmprestimo, LocalDate dataDevolucao, String pessoa, Livro livro) {
		super();
		this.id = id;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
		this.pessoa = pessoa;
		this.livro = livro;
	}	
	
	
}
