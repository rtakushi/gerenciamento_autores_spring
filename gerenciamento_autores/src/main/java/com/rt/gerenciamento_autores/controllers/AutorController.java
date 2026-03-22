package com.rt.gerenciamento_autores.controllers;

import com.rt.gerenciamento_autores.models.Autor;
import com.rt.gerenciamento_autores.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/autor")
public class AutorController {
    @Autowired
    private AutorService service;

    @PostMapping
    public Autor criar(@RequestBody Autor autor) {
        return service.salvar(autor);
    }

    @GetMapping
    public List<Autor> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Autor> buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
