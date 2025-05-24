package br.com.saborexpress.fastfood.application.port.in;

import br.com.saborexpress.fastfood.domain.Produto;

public interface CreateProdutoUseCase {

    Produto criar(Produto cliente);

}
