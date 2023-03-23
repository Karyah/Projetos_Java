	package dominio;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EnderecoProfessor implements Serializable{
	
	private static final long serialVersionUID =1L;
	
	private String bairro;
	private String rua;
	private String cep;
	
	public EnderecoProfessor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EnderecoProfessor(String bairro, String rua, String cep) {
		super();
		this.bairro = bairro;
		this.rua = rua;
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "EnderecoProfessor [bairro=" + bairro + ", rua=" + rua + ", cep=" + cep + "]";
	}
	
	
}
