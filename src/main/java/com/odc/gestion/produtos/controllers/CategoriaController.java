package com.odc.gestion.produtos.controllers;

import com.odc.gestion.produtos.entitys.Categoria;
import com.odc.gestion.produtos.services.CategoriaServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaServico categoriaServico;

    // GET -> Listar todas as categorias
    @GetMapping("/getCategorias")
    public List<Categoria> listar() {
        return categoriaServico.listarTodos();
    }

    // POST -> Criar uma nova categoria
    @PostMapping("/create")
    public Categoria criar(@RequestBody Categoria categoria) {
        return categoriaServico.salvar(categoria);
    }
}
