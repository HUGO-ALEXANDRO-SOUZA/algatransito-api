package com.algaworks.algatransito.domain.model;

import com.algaworks.algatransito.domain.validation.ValidationGroups;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode
@Entity
public class Proprietario {

    @NotNull(groups = ValidationGroups.ProprietarioId.class)
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 60)
    private String nome;

    @NotBlank
    @Size(max = 60)
    @Email
    private String email;

    @NotBlank
    @Column(name = "FONE")
    private String telefone;
}
