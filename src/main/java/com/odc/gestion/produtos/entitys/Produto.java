package com.odc.gestion.produtos.entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


// Esta claase representa um produto dentro do sistema
@Entity
@Table(name = "t_produtos") // força o nome da tabela no banco
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // chave primária auto incremento
    private Long id;

    private String nome;
    private String descricao;
    private Double preco;
    private int quantidade;
    private LocalDateTime data;

    // Relacionamento: muitos produtos podem pertencer a 1 categoria
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

}
