package br.com.saborexpress.fastfood.application.port.out;

import br.com.saborexpress.fastfood.adapters.out.persistence.ProdutoEntity;
import br.com.saborexpress.fastfood.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ProdutoRepository {

 // a interface ProdutoRepository é um repositório de dados, responsável pela comunicação com o banco

    List<Produto> getProdutos();
    Optional<Produto> getProduto (UUID id);
    Produto salvarProduto(Produto produto);
    void excluirProduto(UUID id);

}