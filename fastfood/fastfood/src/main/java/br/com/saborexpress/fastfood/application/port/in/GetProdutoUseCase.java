package br.com.saborexpress.fastfood.application.port.in;

import br.com.saborexpress.fastfood.domain.Produto;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface GetProdutoUseCase {

     // Método que retorna uma lista com todos os produtos disponíveis no sistema
    List<Produto> getProdutos();
    //  Método que busca um produto pelo id, retornando um Optional (Se o valor é encontrado, o Optional contém o valor;
    //  se não for encontrado, o Optional fica vazio.)
    Optional<Produto> getProduto(UUID id);
}
