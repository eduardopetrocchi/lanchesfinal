package com.lancheria.lanchonete.service;

import java.util.List;

import com.lancheria.lanchonete.entity.Cliente;
import com.lancheria.lanchonete.entity.form.ClienteForm;


public interface ClienteService {
    Cliente create(ClienteForm form);

    Cliente findById(Long id);

    List<Cliente> findAll();

    Cliente update(Long id, ClienteForm form);



}
