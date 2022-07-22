package com.example.demo.repositorios;
import com.example.demo.modelos.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface PedidoRepositorio extends CrudRepository<Pedido,Long> {

}