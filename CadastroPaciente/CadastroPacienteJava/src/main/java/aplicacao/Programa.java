package aplicacao;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import dominio.*;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paciente p1 = new Paciente(
				"12 345 678-9",
				"Elias",
				new Endereco("sp", "São Paulo", "Bela Vista","Avenida Paulista", "01311-000","7° Andar", 1106),
				"(11)1234-5678",
				LocalDate.of(1971, 02, 20),
				"Professor",
				"emailelias@gmail.com");
		
		Paciente p2 = new Paciente("78 123 783 9",
				"José Marcos",
				new Endereco("MG","Uberlandia", "Santa Rosa", "Rua Santa Catarina", "09376-888", "Bloco C", 192),
				"(34)4321-6789",
				LocalDate.of(1999, 06, 15),
				"Médico",
				"josemarcos@yahoo.com.br");
		
		Paciente p3 = new Paciente("11.222.333-4",
				"Karen Tiqueira",
				new Endereco("SP", "São Paulo", "Santana", "Rua José Soares", "01234 556", 1072),
				"(11)987650023",
				LocalDate.of(2004, 02, 25),
				"Programadora Senior",
				"karenakaren@gmail.com");
		
		Paciente p4 = new Paciente("34.156.009-1",
				"Paola Mendes",
				new Endereco("RJ","Rio de Janeiro", "Cidade Nova", "Rua Frei Caneca", "01111-001", 204),
				"(21)95432-5687",
				LocalDate.of(2002, 03, 18),
				"Dentista",
				"emaildappaola@bol.com.br");
		
		Paciente p5 = new Paciente("11 612 571 1",
				"Roberta Nunes",
				new Endereco("GO","Goiânia", "St. central", "Rua 7", "02341 238", 456),
				"(62)9776-6789",
				LocalDate.of(1989, 12, 06),
				"Secretária",
				"robertanuunes@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-enterprise");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		em.persist(p5);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
			
	}
	
}
