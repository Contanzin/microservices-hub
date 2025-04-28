package com.github.contanzin.ms_pedido.service;

import com.github.contanzin.ms_pedido.dto.PedidoDTO;
import com.github.contanzin.ms_pedido.repositories.PedidoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    @Transactional(readOnly = true)
    public List<PedidoDTO> getAllPedidos(){

        return repository.findAll().stream().map(PedidoDTO::new).toList();
    }


}
