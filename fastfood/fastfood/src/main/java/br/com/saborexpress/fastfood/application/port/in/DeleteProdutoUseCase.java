package br.com.saborexpress.fastfood.application.port.in;

import java.util.UUID;

public interface DeleteProdutoUseCase {
    void excluir (UUID idProduto);
}
