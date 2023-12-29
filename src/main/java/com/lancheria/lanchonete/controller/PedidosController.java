package com.lancheria.lanchonete.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lancheria.lanchonete.entity.Pedidos;
import com.lancheria.lanchonete.entity.form.PedidosForm;
import com.lancheria.lanchonete.service.PedidosService;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {
    @Autowired
    private PedidosService pedidosService;

    @PostMapping
    public ResponseEntity<Pedidos> create(@RequestBody PedidosForm form) {
        Pedidos novoPedido = pedidosService.create(form);
        return ResponseEntity.ok(novoPedido);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedidos> findById(@PathVariable Long id) {
        Pedidos pedido = pedidosService.findById(id);
        if (pedido != null) {
            return ResponseEntity.ok(pedido);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Pedidos>> findAll() {
        List<Pedidos> pedidos = pedidosService.findAll();
        return ResponseEntity.ok(pedidos);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pedidos> update(@PathVariable Long id, @RequestBody PedidosForm form) {
        Pedidos pedido = pedidosService.update(id, form);
        return ResponseEntity.ok(pedido);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        pedidosService.delete(id);
        return ResponseEntity.noContent().build();
    }
}