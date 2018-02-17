package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TBEMPRESTIMO")
public class Emprestimo {
	/**ATRIBUTOS**/
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "emprestimo_inicio", nullable = false)
	private Date dataEmprestimo;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "emprestimo_fim")
	private Date dataDevolucao;
	
	@Column(name = "emprestimo_nome_pessoa", length=15, nullable = false)
	private String pessoa;

	@ManyToOne
	@JoinColumn(name = "livro_id", nullable = false, referencedColumnName="id")
	private Livro livro;
	
	/**GETTERS E SETTERS**/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	
	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Date dataDevolucao) {
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
	
	public Emprestimo(int id, Date dataEmprestimo, Date dataDevolucao, String pessoa, Livro livro) {
		super();
		this.id = id;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
		this.pessoa = pessoa;
		this.livro = livro;
	}	
	
	
}
