package dominio;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class Endereco {
	private String uf;
	private String cidade;
	private String bairro;
	private String logradouro;
	private String cep;
	private String complemento;
	private int numero;
	
	public Endereco() {
		super();
	}
	
	public Endereco(String uf, String cidade, String bairro, String logradouro, String cep, int numero) {
		super();
		this.uf = uf;
		this.cidade = cidade;
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.cep = cep;
		this.numero = numero;
	}

	public Endereco(String uf, String cidade, String bairro, String logradouro, String cep, String complemento, int numero) {
		super();
		this.uf = uf;
		this.cidade = cidade;
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.cep = cep;
		this.complemento = complemento;
		this.numero = numero;
	}
	
	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}


	@Override
	public String toString() {
		return "Endereco [uf=" + uf + ", cidade=" + cidade + ", bairro=" + bairro + ", logradouro=" + logradouro
				+ ", cep=" + cep + ", complemento=" + complemento + ", numero=" + numero + "]";
	}


	
}
