package com.odc.gestion.produtos.services;

import com.odc.gestion.produtos.ProdutoRequest;
import com.odc.gestion.produtos.entitys.Categoria;
import com.odc.gestion.produtos.entitys.Produto;
import com.odc.gestion.produtos.repositorys.CategoriaRepository;
import com.odc.gestion.produtos.repositorys.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

// Contém a lógica de negócios para Produto

@Service
public class ProdutoServico {

    // Injeção de dependência
    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private CategoriaServico categoriaServico;

    // Listar todos os produtos
    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    public ResponseEntity<?> salvar(ProdutoRequest produtoRequest) {
        Produto newProduto = new Produto();

        //Procurar a categoria
        Optional<Categoria> categoria = categoriaServico.findById(produtoRequest.getCategoriaId());

        if (categoria.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("A categoria com o ID "+produtoRequest.getCategoriaId()+ " nao foi encontrada");
        }

        newProduto.setNome(produtoRequest.getNome());
        newProduto.setCategoria(categoria.get());
        newProduto.setDescricao(produtoRequest.getDescricao());
        newProduto.setQuantidade(produtoRequest.getQuantidade());
        newProduto.setPreco(produtoRequest.getPreco());
        newProduto.setData(LocalDateTime.now());
        produtoRepository.save(newProduto);

        return ResponseEntity.status(HttpStatus.CREATED).body("Categoria criada com sucesso! ");
    }
}
