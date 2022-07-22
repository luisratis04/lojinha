package com.example.demo.DTO;

import com.example.demo.modelos.ItemPedido;
import com.example.demo.modelos.Produto;

public class ItemPedidoDTO {
    private long id_produto;
    private int quantidade;

    public ItemPedido toItemPedido(Produto produto){
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setQuantidade(this.quantidade);
        itemPedido.setProdutoDoItem(produto);
        return itemPedido;
    }
    public long getId_produto() {
        return id_produto;
    }

    public void setId_produto(long id_produto) {
        this.id_produto = id_produto;
    }

    public long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
