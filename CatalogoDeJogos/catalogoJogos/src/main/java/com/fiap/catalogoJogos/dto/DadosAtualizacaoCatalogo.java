
package com.fiap.catalogoJogos.dto;

import com.fiap.catalogoJogos.catalogo.EnumGenero;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosAtualizacaoCatalogo(
		@NotNull
		Long id,
		String titulo,
		String desenvolvedora,
		String idiomas, 
		String distribuidora,
		
		@Pattern(regexp = "\\d{4}")
		String dataLancamento,
		
		@Pattern(regexp = "[1-4]")
		String numeroJogadores,
		
		EnumGenero genero, 
		DadosRequisitos requisitos) {
	
	
}
