package br.com.saborexpress.fastfood.application.port.in;

import br.com.saborexpress.fastfood.domain.Produto;

import java.util.UUID;

public interface UpdateProdutoUseCase {

    /*
UpdateProdutoUseCase: Interface que define a operação de atualizar um produto.
Produto detalhesProduto: Objeto que contém as novas informações do produto a ser atualizado.
UUID id: id do produto a ser atualizado.
Produto: Objeto que representa o produto, retornado após a atualização.
     */


    Produto atualizarProduto(Produto detalhesProduto, UUID id);
}
