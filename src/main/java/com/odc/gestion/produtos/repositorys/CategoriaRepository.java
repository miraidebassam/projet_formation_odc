package com.odc.gestion.produtos.repositorys;

import com.odc.gestion.produtos.entitys.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
