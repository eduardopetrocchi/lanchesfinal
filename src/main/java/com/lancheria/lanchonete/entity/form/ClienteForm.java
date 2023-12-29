package com.lancheria.lanchonete.entity.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteForm {

    @NotEmpty(message = "Campo obrigatorio")
    @Size(min = 3, max = 50, message = "Preencha corretamente")
    private String nome;
    
    @NotEmpty(message = "Campo obrigatorio")
    @Size(min = 3, max = 50, message = "Preencha corretamente")
    private String sobrenome;

    @NotEmpty(message = "Campo obrigatorio")
    @Size(min = 3, max = 50, message = "Preencha corretamente")
    private String endereco;
}
