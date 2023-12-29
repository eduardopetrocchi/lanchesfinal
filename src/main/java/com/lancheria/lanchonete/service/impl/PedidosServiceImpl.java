package com.lancheria.lanchonete.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lancheria.lanchonete.entity.Cliente;
import com.lancheria.lanchonete.entity.Pedidos;
import com.lancheria.lanchonete.entity.form.PedidosForm;
import com.lancheria.lanchonete.repository.ClienteRepository;
import com.lancheria.lanchonete.repository.PedidosRepository;
import com.lancheria.lanchonete.service.PedidosService;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

@Service
public class PedidosServiceImpl implements PedidosService{

    @Autowired
    private PedidosRepository pedidosRepository;
    

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Pedidos create(PedidosForm form) {

        Pedidos pedido = new Pedidos();

        Long idCliente = form.getIdCliente();
        Cliente cliente = clienteRepository.findById(idCliente)
            .orElseThrow(() -> new EntityNotFoundException("Cliente não encontrado com o ID: " + idCliente));

        pedido.setCliente(cliente);
        return pedidosRepository.save(pedido);
    }

    @Override
    public Pedidos findById(Long id) {
        Optional<Pedidos> pedidosOptional = pedidosRepository.findById(id);
        return pedidosOptional.orElse(null); 
    }

    @Override
    public List<Pedidos> findAll() {
        return pedidosRepository.findAll();
    }

    @Transactional
    public void delete(Long id) {   
        Pedidos pedido = pedidosRepository.findById(id).get();
        pedidosRepository.delete(pedido);
    }

    @Override
    public Pedidos update(Long id, PedidosForm form) {
        Pedidos pedidoAtual = findById(id);

        pedidoAtual.setPedido(form.getEstoque());
        pedidoAtual.getCliente();

        return pedidosRepository.save(pedidoAtual);
    }
}