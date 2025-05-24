package br.com.saborexpress.fastfood.adapters.in.web;

import br.com.saborexpress.fastfood.adapters.out.persistence.ProdutoEntity;
import br.com.saborexpress.fastfood.application.port.in.CreateProdutoUseCase;
import br.com.saborexpress.fastfood.application.port.in.DeleteProdutoUseCase;
import br.com.saborexpress.fastfood.application.port.in.GetProdutoUseCase;
import br.com.saborexpress.fastfood.application.port.in.UpdateProdutoUseCase;
import br.com.saborexpress.fastfood.application.port.out.ProdutoRepository;
import br.com.saborexpress.fastfood.domain.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/produtos")
@CrossOrigin("*")

public class ProdutoController {

   @Autowired
    private CreateProdutoUseCase createProdutoUseCase;
   @Autowired
    private DeleteProdutoUseCase deleteProdutoUseCase;
   @Autowired
    private GetProdutoUseCase getProdutoUseCase;
   @Autowired
    private UpdateProdutoUseCase updateProdutoUseCase;

   @PostMapping
    public ResponseEntity<Produto> criar (@RequestBody Produto produto){
       Object Produto;
       Produto produtoCriado = createProdutoUseCase.criar(produto);
       return new ResponseEntity<>(produtoCriado, HttpStatus.CREATED);
   }
}