package com.odc.gestion.produtos.entitys;

import jakarta.persistence.*;

// Itens dentro de um pedido

@Entity
@Table(name = "t_produto_itens")
public class PedidoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantidade;
    private Double precoUnitario;

    // Relacionamento: cada item está associado a um produto
    @ManyToOne
    private Produto produto;

    // Relacionamento: cada item pertence a um pedido
    @ManyToOne
    private Pedido pedido;
}
