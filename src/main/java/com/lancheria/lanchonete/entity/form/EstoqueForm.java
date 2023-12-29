package com.lancheria.lanchonete.entity.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstoqueForm {

    @NotEmpty(message = "Campo obrigatorio")
    @Size(min = 3, max = 50, message = "Preencha corretamente")
    private String nomeProduto;
    
    @NotEmpty(message = "Campo obrigatorio")
    @Size(min = 1, max = 50, message = "Preencha corretamente")
    private Long quantidade;

    @NotEmpty(message = "Campo obrigatorio")
    @Size(min = 1, max = 50, message = "Preencha corretamente")
    private Double valor;
}
