package com.avaliacao.beneficiarioapi.model;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
@Entity
@Data
public class Beneficiario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    private Long telefone;

    private LocalDate dataNascimento;

    @OneToMany(mappedBy = "beneficiario")
    private Set<Documento> documentos = new HashSet<>();

    @Column(name = "data_inclusao", updatable = false)
    private LocalDateTime dataInclusao;

    @Column(name = "data_atualizacao")
    private LocalDateTime dataAtualizacao;

    @PrePersist
    public void prePersist() {
        this.dataInclusao = LocalDateTime.now();
        this.dataAtualizacao = LocalDateTime.now();
    }
    @PreUpdate
    public void preUpdate() {
        this.dataAtualizacao = LocalDateTime.now();
    }
}