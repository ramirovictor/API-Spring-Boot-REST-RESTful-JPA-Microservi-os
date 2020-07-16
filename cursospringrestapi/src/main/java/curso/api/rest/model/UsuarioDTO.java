package curso.api.rest.model;

import java.io.Serializable;

public class UsuarioDTO implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private String userLogin;
	private String userCpf;
	private String userNome;
	
	
	public UsuarioDTO(Usuario usuario) {
		
		this.userLogin = usuario.getLogin();
		//this.userCpf = usuario.getCpf();
		this.userNome = usuario.getNome();
	}
	
	public String getUserLogin() {
		return userLogin;
	}
	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}
	public String getUserCpf() {
		return userCpf;
	}
	public void setUserCpf(String userCpf) {
		this.userCpf = userCpf;
	}
	public String getUserNome() {
		return userNome;
	}
	public void setUserNome(String userNome) {
		this.userNome = userNome;
	}

	
	
}
