package com.example.demo.modelos;



import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @NotEmpty
    private String data;
    @NotNull
    private long numRastreio;
    @NotNull
    private boolean frete;

    @OneToMany
    private List<ItemPedido> itensDoPedido;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public List<ItemPedido> getItensDoPedido() {
        return itensDoPedido;
    }

    public void setItensDoPedido(List<ItemPedido> itensDoPedido) {
        this.itensDoPedido = itensDoPedido;
    }
}
