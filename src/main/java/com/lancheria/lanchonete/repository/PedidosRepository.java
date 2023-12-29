package com.lancheria.lanchonete.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lancheria.lanchonete.entity.Pedidos;

import jakarta.transaction.Transactional;

@Repository
public interface PedidosRepository extends JpaRepository<Pedidos, Long> {

    Optional<Pedidos> findById(Long id_pedido);

    @Modifying
    @Transactional
    @Query("DELETE FROM Pedidos p WHERE p.cliente.id_cliente = :clienteId")
    void deleteByClienteId(Long clienteId);
}
