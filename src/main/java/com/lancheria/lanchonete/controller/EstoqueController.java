package com.lancheria.lanchonete.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.lancheria.lanchonete.entity.Estoque;
import com.lancheria.lanchonete.entity.form.EstoqueForm;
import com.lancheria.lanchonete.service.EstoqueService;



@RestController
@RequestMapping("/estoque")
public class EstoqueController {
    @Autowired
    private EstoqueService estoqueService;

    @PostMapping
    public ResponseEntity<Estoque> create(@RequestBody EstoqueForm form) {
        Estoque novoPedido = estoqueService.create(form);
        return ResponseEntity.ok(novoPedido);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estoque> findById(@PathVariable Long id) {
        Estoque produto = estoqueService.findById(id);
        if (produto != null) {
            return ResponseEntity.ok(produto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Estoque>> findAll() {
        List<Estoque> produto = estoqueService.findAll();
        return ResponseEntity.ok(produto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estoque> update(@PathVariable Long id, @RequestBody EstoqueForm form) {
        Estoque estoqueAtualizado = estoqueService.update(id, form);
        return ResponseEntity.ok(estoqueAtualizado);
    }
  
    
}

