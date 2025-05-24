package br.com.saborexpress.fastfood.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class Produto {

    private UUID id;
    private String nome;
    private String categoria;
    private String descricao;
    private BigDecimal preco;
    private String fotoBase64;
    private LocalDateTime dataCdastro;
    private Boolean ativo;

}