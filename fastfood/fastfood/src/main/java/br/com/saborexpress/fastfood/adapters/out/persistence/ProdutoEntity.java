package br.com.saborexpress.fastfood.adapters.out.persistence;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name ="produtos")
@AllArgsConstructor
public class ProdutoEntity {

    // @Id é usado para marcar o campo como a chave primária
    //@GeneratedValue especifica como o valor da PK será gerado automaticamente pelo banco de dados
    // strategy = GenerationType.IDENTITY: o valor da PK será gerado automaticamente pelo banco de dados
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

   // nullable = false: Garante que a coluna não pode ser null no banco de dados.
    @Column(name = "nome", nullable = false)
    private String nome ;

    @Column(name = "categoria", nullable = false)
    private String categoria ;

    @Column(name = "descricao", nullable = false)
    private String descricao ;

    @Column(name = "preco", nullable = false)
    private BigDecimal preco;

    @Column(name = "fotoBase64", nullable = false, length = Integer.MAX_VALUE)
    private String fotoBase64 ;

    @Column(name = "dataCadastro", nullable = false)
    private LocalDateTime dataCadastro ;

    @Column(name = "ativo", nullable = false)
    private boolean ativo ;

}
