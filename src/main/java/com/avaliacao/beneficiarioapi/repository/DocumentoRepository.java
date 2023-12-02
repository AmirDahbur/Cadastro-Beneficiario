package com.avaliacao.beneficiarioapi.repository;

import com.avaliacao.beneficiarioapi.model.Documento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentoRepository extends JpaRepository<Documento , Long> {
    List<Documento> findByBeneficiarioId (Long BeneficiarioId);
}
