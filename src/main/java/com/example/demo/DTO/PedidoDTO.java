package com.example.demo.DTO;

import java.util.List;

public class PedidoDTO {
    private String data;
    private long numRastreio;
    private boolean frete;
    private List<ItemPedidoDTO> itensPedido;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public long getNumRastreio() {
        return numRastreio;
    }

    public void setNumRastreio(long numRastreio) {
        this.numRastreio = numRastreio;
    }

    public boolean isFrete() {
        return frete;
    }

    public void setFrete(boolean frete) {
        this.frete = frete;
    }

    public List<ItemPedidoDTO> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(List<ItemPedidoDTO> itensPedido) {
        this.itensPedido = itensPedido;
    }
}
