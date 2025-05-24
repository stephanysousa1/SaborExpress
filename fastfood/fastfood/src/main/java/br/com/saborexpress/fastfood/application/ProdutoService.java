package br.com.saborexpress.fastfood.application;

import br.com.saborexpress.fastfood.application.port.in.CreateProdutoUseCase;
import br.com.saborexpress.fastfood.application.port.out.ProdutoRepository;
import br.com.saborexpress.fastfood.domain.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService implements CreateProdutoUseCase {


    @Autowired
    private ProdutoRepository repository;

    @Override
    public Produto criar(Produto cliente) {
        return repository.salvarProduto(produto);
    }
}

// service precisa de uma porta de saida p se comunicar com os adaptadores de saida