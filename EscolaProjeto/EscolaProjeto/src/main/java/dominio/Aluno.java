package dominio;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Aluno implements Serializable{
	
	private static final long serialVersionUID =1L;
	
	@EmbeddedId
	private AlunoId id;
	
	@Column(name = "dataNasc")
	private LocalDate dataNascimento;
	
	@Enumerated(EnumType.STRING)
	private EnumDeficiencia deficiencia;
	
	private String nome;
	private String turma;
	

	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aluno(AlunoId id, String nome, String turma, LocalDate dataNascimento, EnumDeficiencia deficiencia) {
		super();
		this.id = id;
		this.nome = nome;
		this.turma = turma;
		this.dataNascimento = dataNascimento;
		this.deficiencia = deficiencia;
	}

	public AlunoId getId() {
		return id;
	}

	public void setId(AlunoId id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public LocalDate getDataNasc() {
		return dataNascimento;
	}

	public void setDataNasc(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public EnumDeficiencia getDeficiencia() {
		return deficiencia;
	}

	public void setDeficiencia(EnumDeficiencia deficiencia) {
		this.deficiencia = deficiencia;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", turma=" + turma + ", dataNasc=" + dataNascimento + ", deficiencia="
				+ deficiencia + "]";
	}
	
	
	
}
