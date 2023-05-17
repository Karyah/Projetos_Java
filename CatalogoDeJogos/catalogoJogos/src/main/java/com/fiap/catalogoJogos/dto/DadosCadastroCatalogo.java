
package com.fiap.catalogoJogos.dto;

import com.fiap.catalogoJogos.catalogo.EnumGenero;
import com.fiap.catalogoJogos.requisitos.Requisitos;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroCatalogo(
		
		@NotBlank
		String titulo,
		
		@NotBlank
		String desenvolvedora,
		
		@NotBlank
		String idiomas,
		
		String distribuidora,
		
		@NotBlank
		@Pattern(regexp = "\\d{4}")
		String dataLancamento,
		
		@NotBlank
		@Pattern(regexp = "[1-4]")
		String numeroJogadores,
		
		@NotNull
		@Valid
		DadosRequisitos requisitosSistema,
		
		@NotNull
		EnumGenero genero
		) {

}
