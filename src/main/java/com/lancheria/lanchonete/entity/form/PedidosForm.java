package com.lancheria.lanchonete.entity.form;

import com.lancheria.lanchonete.entity.Cliente;
import com.lancheria.lanchonete.entity.Estoque;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PedidosForm {

    @NotEmpty(message = "Campo obrigatorio")
    @Size(min = 1, max = 50, message = "Preencha corretamente")
    private Estoque estoque;
    
    @NotEmpty(message = "Campo obrigatorio")
    @Size(min = 1, max = 50, message = "Preencha corretamente")
    private Estoque nomeProdutEstoque;

    @NotEmpty(message = "Campo obrigatorio")
    @Size(min = 3, max = 50, message = "Preencha corretamente")
    private Cliente nome;

    @NotEmpty(message = "Campo obrigatorio")
    @Size(min = 3, max = 50, message = "Preencha corretamente")
    private Cliente endereco;

    private Long idEstoque;
    private Long idCliente;
    
}
