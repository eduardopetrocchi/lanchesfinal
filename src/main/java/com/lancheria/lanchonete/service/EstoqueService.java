package com.lancheria.lanchonete.service;

import java.util.List;

import com.lancheria.lanchonete.entity.Estoque;
import com.lancheria.lanchonete.entity.form.EstoqueForm;


public interface EstoqueService {
    Estoque create(EstoqueForm form);

    Estoque findById(Long id);

    List<Estoque> findAll();

    Estoque update(Long id, EstoqueForm form);

}
