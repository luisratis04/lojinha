package com.example.demo.modelos;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Min(value = 0)
    private int quantidade;

    @OneToOne
    private Produto produtoDoItem;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProdutoDoItem() {
        return produtoDoItem;
    }

    public void setProdutoDoItem(Produto produtoDoItem) {
        this.produtoDoItem = produtoDoItem;
    }
}