package com.lancheria.lanchonete.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lancheria.lanchonete.entity.Estoque;
import com.lancheria.lanchonete.entity.form.EstoqueForm;
import com.lancheria.lanchonete.repository.EstoqueRepository;
import com.lancheria.lanchonete.service.EstoqueService;



@Service
public class EstoqueServiceImpl implements EstoqueService{

    @Autowired
    private EstoqueRepository estoqueRepository;

    @Override
    public Estoque create(EstoqueForm form) {
        Estoque produto = new Estoque();
        produto.setNomeProduto(form.getNomeProduto());
        produto.setQuantidade(form.getQuantidade());
        produto.setValor(form.getValor());

       
        return estoqueRepository.save(produto);
    }

    @Override
    public Estoque findById(Long id) {
        Optional<Estoque> clienteOptional = estoqueRepository.findById(id);
        return clienteOptional.orElse(null); 
    }

    @Override
    public List<Estoque> findAll() {
        return estoqueRepository.findAll();
    }

    @Override
    public Estoque update(Long id, EstoqueForm form) {
        Estoque produtoEstoque = findById(id);

        produtoEstoque.setQuantidade(form.getQuantidade());
        return estoqueRepository.save(produtoEstoque);
    }
}