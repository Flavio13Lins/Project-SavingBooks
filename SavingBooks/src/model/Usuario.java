package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBUSUARIO")
public class Usuario {
	/**ATRIBUTOS**/
	@Id
	@Column(name = "usuario_email", length=25, nullable = false, unique = true)
	private String email;
	
	@Column(name = "usuario_nick", length=15, nullable = false, unique = true)
	private String nickname;
	
	@Column(name = "usuario_senha", length=20, nullable = false)
	private String senha;
	
	/**GETTERS E SETTERS**/
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**CONSTRUTORES**/
	public Usuario() {
		super();
	}
	public Usuario(String email, String nickname, String senha) {
		super();
		this.email = email;
		this.nickname = nickname;
		this.senha = senha;
	}
	
	
	
}
