package br.com.saborexpress.fastfood.adapters.out.persistence;

import br.com.saborexpress.fastfood.application.port.out.ProdutoRepository;
import br.com.saborexpress.fastfood.domain.Produto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ProdutoRepositoryPersistenceAdapter implements ProdutoRepository {

    @Autowired
    private ProdutoJpaRepository repository;

    @Override
    public List<Produto> getProdutos() {
        return List.of();
    }

    @Override
    public Optional<Produto> getProduto(UUID id) {
        return Optional.empty();
    }

    @Override
    public Produto salvarProduto(Produto produto) {
        return null;
    }

    @Override
    public void excluirProduto(UUID id) {

    }
}
