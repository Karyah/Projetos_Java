
package com.fiap.catalogoJogos.catalogo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogoRepository extends JpaRepository<Catalogo, Long>{
	
	Page<Catalogo> findAllByAtivoTrue(Pageable paginacao);
	
}
