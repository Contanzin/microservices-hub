package com.github.contanzin.ms_pedido.repositories;

import com.github.contanzin.ms_pedido.enitities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
