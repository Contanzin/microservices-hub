package com.github.contanzin.ms_pedido.dto;


import com.github.contanzin.ms_pedido.enitities.ItemDoPedido;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ItemDoPedidoDTO {

    private Long id;

    @NotNull(message = "Quantidade Requirida")
    @Positive(message = "A quantidade deve ser um nome positivo")
    private Integer quantidade;
    @NotEmpty(message = "Descricao requirido")
    private String descricao;
    @NotNull(message = "Valor unitario requirido")
    @Positive(message = "Valor unitario deve ser um numero positivo")
    private BigDecimal valorUnitario;

    public ItemDoPedidoDTO(ItemDoPedido entity){
        id = entity.getId();
        quantidade = entity.getQuantidade();
        descricao = entity.getDescricao();
        valorUnitario = entity.getValorUnitario();
    }
}
