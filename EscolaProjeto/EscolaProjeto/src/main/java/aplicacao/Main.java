package aplicacao;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.*;

public class Main {
	public static void main(String[] args) {
		/*--------------------------------------------Cadastro de Alunos--------------------------------------------------*/
		
		Aluno aluno1 = new Aluno(new AlunoId("94488","12 345 678-9"),"Karen Antiqueira", "2TDSPK", 
				LocalDate.of(2004, 02, 25), EnumDeficiencia.NENHUMA);
		
		Aluno aluno2 = new Aluno(new AlunoId("7654","22 333 765 1"), "Roberto Josefino", "1TSFTR",
				LocalDate.of(2006, 10, 5), EnumDeficiencia.FISICA);
		
		Aluno aluno3 = new Aluno(new AlunoId("0033","985440092"), "Alberto Neves", "2TLPÇA",
				LocalDate.of(2000, 07, 17), EnumDeficiencia.INTELECTUAL);
		
		/*-------------------------------------------Cadastro Professores----------------------------------------------------*/
		
		Professor prof1 = new Professor(null, new EnderecoProfessor("Vila Clementino", "Rua dos Bagres","01001-001"), "Elias",
				"Java Enterprise");
		
		Professor prof2 = new Professor(null, new EnderecoProfessor("Parada Inglesa", "Avenida General Ataliba Leonel","07788003"), "Karina Megumi",
				"Machine Learning");
		
		
		Professor prof3 = new Professor(null, new EnderecoProfessor("Vila Olimpia", "Rua Tenente Machado","06688-001"), "Paola Mendes",
				"Mobile");
		
		/*-------------------------------------------Persistindo Objetos--------------------------------------------------*/
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("escola-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(aluno1);
		em.persist(aluno2);
		em.persist(aluno3);
		em.persist(prof1);
		em.persist(prof2);
		em.persist(prof3);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}
}	
