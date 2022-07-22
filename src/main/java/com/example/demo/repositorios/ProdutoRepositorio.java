package com.example.demo.repositorios;
import com.example.demo.modelos.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepositorio extends CrudRepository<Produto,Long>{

}