package com.algaworks.algatransito.domain.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @ManyToOne
    private Proprietario proprietario;

    @Enumerated(EnumType.STRING)
    private StatusVeiculo status;

    private OffsetDateTime dataCadastro;

    private OffsetDateTime dataApreensao;

    private String marca;

    private String modelo;

    private String placa;

    @OneToMany(mappedBy = "veiculo")
    private List<Autuacao> autuacoes = new ArrayList<>();

    public Autuacao adicionarAutuacao(Autuacao novaAutuacao) {
        novaAutuacao.setDataOcorrencia(OffsetDateTime.now());
        novaAutuacao.setVeiculo(this);
        getAutuacoes().add(novaAutuacao);
        return novaAutuacao;
    }
}
