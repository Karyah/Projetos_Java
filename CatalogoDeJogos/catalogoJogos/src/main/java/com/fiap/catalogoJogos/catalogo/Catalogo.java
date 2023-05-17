
package com.fiap.catalogoJogos.catalogo;

import com.fiap.catalogoJogos.dto.DadosAtualizacaoCatalogo;
import com.fiap.catalogoJogos.dto.DadosCadastroCatalogo;
import com.fiap.catalogoJogos.requisitos.Requisitos;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="catalogodejogos")
@Table(name="catalogodejogos")
public class Catalogo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private EnumGenero genero;
	
	@Embedded
	private Requisitos requisitosSistema;
	
	private String titulo, desenvolvedora, idiomas, distribuidora;
	
	@Column(name="data_lancamento")
	private String dataLancamento;
	
	@Column(name="numero_jogadores")
	private String numeroJogadores;
	
	private Boolean ativo;
	
	public Catalogo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Catalogo(DadosCadastroCatalogo dados) {
		super();
		this.ativo = true;
		this.genero = dados.genero();
		this.requisitosSistema = new Requisitos(dados.requisitosSistema());
		this.titulo = dados.titulo();
		this.desenvolvedora = dados.desenvolvedora();
		this.idiomas = dados.idiomas();
		this.distribuidora = dados.distribuidora();
		this.dataLancamento = dados.dataLancamento();
		this.numeroJogadores = dados.numeroJogadores();
	}
	
	public void atualizarInformacoes(DadosAtualizacaoCatalogo dados) {
		if(dados.titulo() != null) {
			this.titulo = dados.titulo();
		}
		if(dados.desenvolvedora() != null) {
			this.desenvolvedora = dados.desenvolvedora();
		}
		if(dados.idiomas() != null) {
			this.idiomas = dados.idiomas();
		}
		if(dados.distribuidora() != null) {
			this.distribuidora = dados.distribuidora();
		}
		if(dados.dataLancamento() != null) {
			this.dataLancamento = dados.dataLancamento();
		}
		if(dados.numeroJogadores() != null) {
			this.numeroJogadores = dados.numeroJogadores();
		}
		if(dados.genero() != null) {
			this.genero = dados.genero();
		}
		if(dados.requisitos() != null) {
			this.requisitosSistema.atualizarInformacoes(dados.requisitos());
		}
	}
	
	public void excluir() {
		this.ativo = false; 
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDesenvolvedora() {
		return desenvolvedora;
	}
	
	public void setDesenvolvedora(String desenvolvedora) {
		this.desenvolvedora = desenvolvedora;
	}
	
	public String getIdiomas() {
		return idiomas;
	}
	
	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}
	
	public String getDistribuidora() {
		return distribuidora;
	}

	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}
	
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
	public String getNumeroJogadores() {
		return numeroJogadores;
	}
	
	public void setNumeroJogadores(String numeroJogadores) {
		this.numeroJogadores = numeroJogadores;
	}
	
	public EnumGenero getGenero() {
		return genero;
	}
	
	public void setGenero(EnumGenero genero) {
		this.genero = genero;
	}
	
	public Requisitos getRequisitosSistema() {
		return requisitosSistema;
	}
	
	public void setRequisitosSistema(Requisitos requisitosSistema) {
		this.requisitosSistema = requisitosSistema;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	
}
