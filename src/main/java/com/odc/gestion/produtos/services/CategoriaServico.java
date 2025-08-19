package com.odc.gestion.produtos.services;

import com.odc.gestion.produtos.entitys.Categoria;
import com.odc.gestion.produtos.entitys.Produto;
import com.odc.gestion.produtos.repositorys.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServico {
    @Autowired
    private CategoriaRepository categoriaRepository;

    // Listar todas as categorias
    public List<Categoria> listarTodos() {
        return categoriaRepository.findAll();
    }

    // Salvar uma categoria
    public Categoria salvar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public Optional<Categoria> findById(Long categoriaId) {
        return categoriaRepository.findById(categoriaId);
    }
}
