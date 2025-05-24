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
@AllArgsConstructor
@Table(name ="produtos")
public class ProdutoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(nullable = false)
    private String nome ;

    @Column(nullable = false)
    private String categoria ;

    @Column(nullable = false)
    private String descricao ;

    @Column(nullable = false)
    private BigDecimal preco;

    @Column(nullable = false)
    private String fotoBase64 ;

    @Column(nullable = false)
    private LocalDateTime dataCadastro ;

    @Column(nullable = false)
    private boolean ativo ;
}
