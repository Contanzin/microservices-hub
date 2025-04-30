package com.github.contanzin.ms_pedido.repositories;

import com.github.contanzin.ms_pedido.enitities.ItemDoPedido;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface ItemDoPedidoRepository extends JpaRepository<ItemDoPedido, Long> {

    @Modifying
    @Transactional
    @Query("DELETE FROM ItemDoPedido i WHERE i.pedido.id = : pedidoId")
    void  deleteByPedidoId(Long pedidoId);
}
