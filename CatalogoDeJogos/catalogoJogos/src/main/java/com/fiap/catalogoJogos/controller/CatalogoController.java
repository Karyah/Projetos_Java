
package com.fiap.catalogoJogos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fiap.catalogoJogos.catalogo.Catalogo;
import com.fiap.catalogoJogos.catalogo.CatalogoRepository;
import com.fiap.catalogoJogos.dto.DadosAtualizacaoCatalogo;
import com.fiap.catalogoJogos.dto.DadosCadastroCatalogo;
import com.fiap.catalogoJogos.dto.DadosListagemCatalogo;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/catalogoDeJogos")
public class CatalogoController {
	
	@Autowired
	private CatalogoRepository repository;
	
	@PostMapping
	@Transactional
	public void postarJogo(@RequestBody @Valid DadosCadastroCatalogo dados) {
		repository.save(new Catalogo(dados));
	}
	
	@GetMapping
	public Page<DadosListagemCatalogo> listar(@PageableDefault(size=5, sort= {"titulo"}) Pageable paginacao){
		return repository.findAllByAtivoTrue(paginacao).map(DadosListagemCatalogo :: new);
	}
	
	@PutMapping
	@Transactional
	public void atualizar(@RequestBody @Valid DadosAtualizacaoCatalogo dados) {
		Catalogo catalogo = new Catalogo();
		catalogo = repository.getReferenceById(dados.id());
		catalogo.atualizarInformacoes(dados);
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public void excluir(@PathVariable Long id) {
		Catalogo catalogo =  new Catalogo();
		catalogo = repository.getReferenceById(id);
		catalogo.excluir();
	}
	
}
