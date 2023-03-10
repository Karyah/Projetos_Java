package dominio;

import java.time.LocalDate;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Paciente implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String rg;
	
	@Embedded
	private Endereco endereco;
	
	@Column( name = "DATA_NASC")
	private LocalDate dtNascimento;
	
	private String nome;
	private String telefone;	
	private String profissao;
	private String email;
	
	
	public Paciente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Paciente(String rg,  String nome, Endereco endereco, String telefone, LocalDate dtNascimento,
			String profissao, String email) {
		super();
		this.rg = rg;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dtNascimento = dtNascimento;
		this.profissao = profissao;
		this.email = email;
	}

	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public LocalDate getDtNascimento() {
		return dtNascimento;
	}
	
	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Paciente [rg=" + rg + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone
				+ ", dtNascimento=" + dtNascimento + ", profissao=" + profissao + ", email=" + email + "]";
	}
	
	
	
}
