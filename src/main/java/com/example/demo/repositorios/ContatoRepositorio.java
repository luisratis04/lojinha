package com.example.demo.repositorios;

import com.example.demo.modelos.Contato;
import org.springframework.data.repository.CrudRepository;

public interface ContatoRepositorio extends CrudRepository<Contato,Long> {


}
