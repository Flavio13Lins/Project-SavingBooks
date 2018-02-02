package model;

public class Usuario {
	/**ATRIBUTOS**/
	private String email;
	private String nickname;
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
