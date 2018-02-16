package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="TBEMPRESTIMO")
public class Emprestimo {
	/**ATRIBUTOS**/
	//@Id
    //@GeneratedValue
	private int id;
	
	//@Temporal(TemporalType.DATE)
	@Column(name = "emprestimo_inicio")
	private LocalDate dataEmprestimo;
	
	//@Temporal(TemporalType.DATE)
	//@Column(name = "emprestimo_fim")
	private LocalDate dataDevolucao;
	
	//@Column(name = "emprestimo_nome_pessoa")
	private String pessoa;

	//dependencia
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
