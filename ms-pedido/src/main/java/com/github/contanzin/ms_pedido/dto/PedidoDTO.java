package com.github.contanzin.ms_pedido.dto;

import com.github.contanzin.ms_pedido.enitities.ItemDoPedido;
import com.github.contanzin.ms_pedido.enitities.Pedido;
import com.github.contanzin.ms_pedido.enitities.Status;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PedidoDTO {

    private Long id;
    @NotEmpty(message = "Nome Rquerido")
    @Size(min = 3, max = 100, message = "O nome deve ter entre 3 a 100 caracteres")
    private String nome;
    @NotBlank(message = "CPF Requirido")
    @Size(min = 11, max =11, message = "CPF deve ter 11 caracteres")
    private  String cpf;
    private LocalDate data;
    @Enumerated(EnumType.STRING)
    private Status status;
    private List<@Valid ItemDoPedidoDTO> items = new ArrayList<>();

    public  PedidoDTO(Pedido entity){
        id = entity.getId();
        cpf = entity.getCpf();
        nome = entity.getNome();
        data = entity.getData();
        status = entity.getStatus();

        for (ItemDoPedido item : entity.getItems()){
            ItemDoPedidoDTO itemDTO = new ItemDoPedidoDTO(item);
            items.add(itemDTO);
        }
    }


}
