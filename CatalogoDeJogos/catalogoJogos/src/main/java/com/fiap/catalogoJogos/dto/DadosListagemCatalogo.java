
package com.fiap.catalogoJogos.dto;

import com.fiap.catalogoJogos.catalogo.Catalogo;
import com.fiap.catalogoJogos.catalogo.EnumGenero;

public record DadosListagemCatalogo (
		Long id,
		String titulo,
		String desenvovedora,
		String numeroJogadores,
		EnumGenero genero,
		String armazenamento
		)
	{
	
	public DadosListagemCatalogo(Catalogo catalogo) {
		this(
			catalogo.getId(),
			catalogo.getTitulo(),
			catalogo.getDesenvolvedora(),
			catalogo.getNumeroJogadores(),
			catalogo.getGenero(),
			catalogo.getRequisitosSistema().getArmazenamento()
		);
	}

	}
