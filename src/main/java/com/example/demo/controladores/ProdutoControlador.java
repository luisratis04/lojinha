package com.example.demo.controladores;

import com.example.demo.modelos.Produto;
import com.example.demo.repositorios.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ProdutoControlador {
    @Autowired
    ProdutoRepositorio produtoRepositorio;
    @PostMapping(value = "/produto",consumes = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<?> salvar(@RequestBody Produto produto){
        System.out.println(produto.getValor());
        produtoRepositorio.save(produto);
        return new ResponseEntity<>(produto, HttpStatus.CREATED);
    }

}
