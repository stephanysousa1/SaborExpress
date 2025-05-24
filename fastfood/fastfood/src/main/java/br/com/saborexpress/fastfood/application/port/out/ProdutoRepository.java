package br.com.saborexpress.fastfood.application.port.out;

import br.com.saborexpress.fastfood.adapters.out.persistence.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {

}