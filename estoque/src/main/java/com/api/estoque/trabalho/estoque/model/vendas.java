package com.api.estoque.trabalho.estoque.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "fto.vendas")
public class vendas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venda")
    private Integer id;

    @Column(name = "data")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_produto")
    private produto produto;

    @Column(name = "quantidade")
    private Integer quantity;

}
