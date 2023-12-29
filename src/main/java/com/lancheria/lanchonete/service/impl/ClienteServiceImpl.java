package com.lancheria.lanchonete.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lancheria.lanchonete.entity.Cliente;
import com.lancheria.lanchonete.entity.form.ClienteForm;
import com.lancheria.lanchonete.repository.ClienteRepository;
import com.lancheria.lanchonete.service.ClienteService;



@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;


    @Override
    public Cliente create(ClienteForm form) {
        Cliente cliente = new Cliente();
        cliente.setNome(form.getNome());
        cliente.setSobrenome(form.getSobrenome());
        cliente.setEndereco(form.getEndereco());

        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente findById(Long id) {
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);
        return clienteOptional.orElse(null); 
    }

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente update(Long id, ClienteForm form) {
        Cliente clienteAtual = findById(id);

        clienteAtual.setEndereco(form.getEndereco());

        return clienteRepository.save(clienteAtual);
    }


    
}