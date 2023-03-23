package dominio;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Professor implements Serializable{
	
	private static final long serialVersionUID =1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Embedded 
	private EnderecoProfessor endereco;
	
	private String nome;
	private String materia;
	
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Professor(Integer id, EnderecoProfessor endereco, String nome, String materia) {
		super();
		this.id = id;
		this.endereco = endereco;
		this.nome = nome;
		this.materia = materia;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public EnderecoProfessor getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoProfessor endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "Professor [id=" + id + ", endereco=" + endereco + ", nome=" + nome + ", materia=" + materia + "]";
	}
	
	
}
