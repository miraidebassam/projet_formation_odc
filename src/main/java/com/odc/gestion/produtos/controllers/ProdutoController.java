package com.odc.gestion.produtos.controllers;

import com.odc.gestion.produtos.ProdutoRequest;
import com.odc.gestion.produtos.entitys.Produto;
import com.odc.gestion.produtos.services.ProdutoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Controlador REST para Produtos

@RestController
@RequestMapping("/api/v1/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoServico produtoServico;

    // GET -> Listar todos os produtos
    @GetMapping("/getProdutos")
    public List<Produto> listar() {
        return produtoServico.listarTodos();
    }

    // POST -> Criar um novo produto
    @PostMapping("/create")
    public ResponseEntity<?> criar(@RequestBody ProdutoRequest produtoRequest) {
        return produtoServico.salvar(produtoRequest);
    }
}
