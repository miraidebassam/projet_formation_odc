package com.odc.gestion.produtos.entitys;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

// Entidade para Pedido feito por um cliente

@Entity
@Table(name = "t_pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime data = LocalDateTime.now();
    private String status; // Ex: "PENDENTE", "PAGO", "CANCELADO"

    // Relacionamento: cada pedido pertence a 1 cliente
    @ManyToOne
    private Cliente cliente;

    // Relacionamento: um pedido pode ter vários itens
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private List<PedidoItem> itens;
}
