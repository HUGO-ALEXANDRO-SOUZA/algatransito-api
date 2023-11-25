package com.algaworks.algatransito.domain.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Proprietario {

    private Long id;
    private String nome;
    private String email;
    private String telefone;
}
