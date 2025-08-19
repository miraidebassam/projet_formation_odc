package com.odc.gestion.produtos.entitys;

import jakarta.persistence.*;

// Entidade cliente que realiza pedidos

@Entity
@Table(name = "t_clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String telefone;
    private String endereco;
}
