package com.lancheria.lanchonete.service;

import java.util.List;

import com.lancheria.lanchonete.entity.Pedidos;
import com.lancheria.lanchonete.entity.form.PedidosForm;


public interface PedidosService {
    Pedidos create(PedidosForm form);

    Pedidos findById(Long id);

    List<Pedidos> findAll();

    Pedidos update(Long id, PedidosForm form);

    void delete(Long id);

}
