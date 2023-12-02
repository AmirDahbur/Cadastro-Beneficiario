package com.avaliacao.beneficiarioapi.model;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
@Entity
@Data
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tipoDocumento;

    private String descricao;

    @ManyToOne (targetEntity = Beneficiario.class)
    private Beneficiario beneficiario;

    @Column(name = "data_inclusao", updatable = false)
    private LocalDateTime dataInclusao;

    @Column(name = "data_atualizacao")
    private LocalDateTime dataAtualizacao;

    @PrePersist
    public void prePersist() {
        this.dataInclusao = LocalDateTime.now();
        this.dataAtualizacao = LocalDateTime.now();
    }
}