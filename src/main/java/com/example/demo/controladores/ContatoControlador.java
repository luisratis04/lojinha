package com.example.demo.controladores;

import com.example.demo.modelos.Contato;
import com.example.demo.modelos.Endereco;
import com.example.demo.repositorios.ContatoRepositorio;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class ContatoControlador {

    @Autowired
    ContatoRepositorio contatoRepositorio;

    @GetMapping("/")
    public String mostrarFormCadastrarContato(){
        return "formCadastrarContato";
    }

    @PostMapping("/salvarContato")
    public String salvar(Contato contato){

        contatoRepositorio.save(contato);

        return "redirect:/listarContatos";
    }

    @GetMapping("/listarContatos")
    public ModelAndView ListarContatos(){
        Iterable<Contato> lista = contatoRepositorio.findAll();
        ModelAndView modelAndView = new ModelAndView("listagemDeContato");
        modelAndView.addObject("lista", lista);
        return  modelAndView;
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable(name = "id") long id){
        System.out.println(id);
        Optional<Contato> contato = contatoRepositorio.findById(id);
        contatoRepositorio.delete(contato.get());
        return "redirect:/listarContatos";

    }

    @GetMapping("/mostrarFormEditar/{id}")
    public ModelAndView mostrarFormEditar(@PathVariable(name = "id") long id){

        Optional<Contato> contato = contatoRepositorio.findById(id);
        ModelAndView modelAndView = new ModelAndView("formEditarContato");
        modelAndView.addObject("contato",contato.get());
        Gson gson = new Gson();

        System.out.println(gson.toJson(contato.get()));

        return modelAndView;
    }

    @PostMapping("/editar/{id}")
    public String editar(Contato contato,@PathVariable(name="id") long id){

        contatoRepositorio.save(contato);
        return "redirect:/listarContatos";

    }

    @GetMapping("/mostrarFormAdicionarEndereco/{id}")
    public ModelAndView mostrarFormAdicionarEndereco(@PathVariable(name="id") long id){

        ModelAndView modelAndView = new ModelAndView("formAdicionarEndereco");
        modelAndView.addObject("id_contato",id);
        return modelAndView;
    }

    @PostMapping("/adicionarEndereco/{id}")
    public String adicionarEndereco(Endereco endereco,@PathVariable(name="id") long id){

        Contato contato = contatoRepositorio.findById(id).get();
        contato.setEndereco(endereco);
        contatoRepositorio.save(contato);
        return "redirect:/listarContatos";

    }

}
