package com.avaliacao.beneficiarioapi.repository;

import com.avaliacao.beneficiarioapi.model.Beneficiario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficiarioRepository extends JpaRepository<Beneficiario, Long> {

}
