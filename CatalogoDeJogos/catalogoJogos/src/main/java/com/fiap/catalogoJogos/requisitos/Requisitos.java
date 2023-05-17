
package com.fiap.catalogoJogos.requisitos;

import com.fiap.catalogoJogos.dto.DadosRequisitos;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;


@Embeddable
public class Requisitos {
	
	@Column(name = "sistema_operacional")
	private String sistemaOperacional;
	
	@Column(name="placa_de_video")
	private String placaDeVideo;
	
	private String processador, memoria,  armazenamento;
	
	public Requisitos() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Requisitos(DadosRequisitos dados) {
		super();
		this.sistemaOperacional = dados.sistemaOperacional();
		this.processador = dados.processador();
		this.memoria = dados.memoria();
		this.placaDeVideo = dados.placaDeVideo();
		this.armazenamento = dados.armazenamento();
	}
	
	public void atualizarInformacoes(DadosRequisitos dados) {
		
		if(dados.sistemaOperacional() != null) {
			this.sistemaOperacional = dados.sistemaOperacional();
		}
		if(dados.processador() != null) {
			this.processador = dados.processador();
		}
		if(dados.memoria() != null) {
			this.memoria = dados.memoria();
		}
		if(dados.placaDeVideo() != null) {
			this.placaDeVideo = dados.placaDeVideo();
		}
		if(dados.armazenamento() != null) {
			this.armazenamento = dados.armazenamento();
		}
	}
	
	public String getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	public String getPlacaDeVideo() {
		return placaDeVideo;
	}

	public void setPlacaDeVideo(String placaDeVideo) {
		this.placaDeVideo = placaDeVideo;
	}

	public String getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(String armazenamento) {
		this.armazenamento = armazenamento;
	}
	
	
	
}
