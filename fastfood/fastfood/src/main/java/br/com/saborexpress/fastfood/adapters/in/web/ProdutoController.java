package br.com.saborexpress.fastfood.adapters.in.web;

import br.com.saborexpress.fastfood.adapters.out.persistence.ProdutoEntity;
import br.com.saborexpress.fastfood.application.port.out.ProdutoRepository;
import br.com.saborexpress.fastfood.domain.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@CrossOrigin("*")

public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping
    public List<ProdutoEntity> listarProdutos() {
        List<ProdutoEntity> produtos = produtoRepository.findAll();
        return produtos;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Produto> obterProduto(@PathVariable Long id) {

        ProdutoEntity produtoEntity = produtoRepository.getReferenceById(id);

        if(produtoEntity != null) {
            Produto produto = new Produto(produtoEntity.getId(), produtoEntity.getNome(), produtoEntity.getCategoria(),produtoEntity.getDescricao(), produtoEntity.getPreco(),
                    produtoEntity.getFotoBase64(), produtoEntity.getDataCadastro(), produtoEntity.isAtivo() );
            return new ResponseEntity<>(produto, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<Produto> criarProduto(@RequestBody Produto produto) {
        ProdutoEntity produtoEntity = new ProdutoEntity();
        produtoEntity.setNome(produto.getNome());
        produtoEntity.setCategoria(produto.getCategoria());
        produtoEntity.setDescricao(produto.getDescricao());
        produtoEntity.setPreco(produto.getPreco());
        produtoEntity.setFotoBase64(produto.getFotoBase64());
        produtoEntity.setDataCadastro(produto.getDataCdastro());
        produtoEntity.setAtivo(produto.getAtivo());

        produtoRepository.save(produtoEntity);

        return new ResponseEntity<>(produto, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizarProduto(@PathVariable Long id, @RequestBody Produto produtoAtualizado) {

        ProdutoEntity produtoEntity = produtoRepository.getReferenceById(id);

        if(produtoEntity != null) {
            produtoEntity.setNome(produtoAtualizado.getNome());
            produtoRepository.save(produtoEntity);
            return new ResponseEntity<>(produtoAtualizado, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarProduto(@PathVariable Long id) {

        ProdutoEntity produtoEntity = produtoRepository.getReferenceById(id);

        if(produtoEntity != null) {
            produtoRepository.delete(produtoEntity);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}