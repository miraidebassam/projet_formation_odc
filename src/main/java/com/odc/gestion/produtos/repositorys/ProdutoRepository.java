package com.odc.gestion.produtos.repositorys;

import com.odc.gestion.produtos.entitys.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Repositório que herda métodos prontos como findAll, save, deleteById

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
