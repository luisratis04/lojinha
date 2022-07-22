package com.example.demo.controladores;

import com.example.demo.DTO.PedidoDTO;
import com.example.demo.modelos.ItemPedido;
import com.example.demo.modelos.Pedido;
import com.example.demo.modelos.Produto;
import com.example.demo.repositorios.PedidoRepositorio;
import com.example.demo.repositorios.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.stream.Collectors;


@Controller
public class PedidoControlador {
    @Autowired
    PedidoRepositorio pedidoRepositorio;
    @Autowired
    ProdutoRepositorio produtoRepositorio;
    @PostMapping(value = "/pedido",consumes = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<?> criarPedido(@RequestBody PedidoDTO pedidoDTO){
        Iterable<Produto> produtos = produtoRepositorio.findAllById(pedidoDTO.getItensPedido().stream().map(itemPedidoDTO -> itemPedidoDTO.getId_produto()).collect(Collectors.toList()));

    }
    public Iterable<Produto>
}
