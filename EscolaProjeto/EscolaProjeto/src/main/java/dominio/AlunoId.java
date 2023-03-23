package dominio;

import java.io.Serializable;

import javax.persistence.Column;

public class AlunoId implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Column(name = "numMatricula")
	private String nMatricula;
	
	@Column(name = "rgAluno")
	private String rg;
	
	public AlunoId() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AlunoId(String nMatricula, String rg) {
		super();
		this.nMatricula = nMatricula;
		this.rg = rg;
	}

	public String getnMatricula() {
		return nMatricula;
	}

	public void setnMatricula(String nMatricula) {
		this.nMatricula = nMatricula;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public String toString() {
		return "AlunoId [nMatricula=" + nMatricula + ", rg=" + rg + "]";
	}
	
	
	
	
}

