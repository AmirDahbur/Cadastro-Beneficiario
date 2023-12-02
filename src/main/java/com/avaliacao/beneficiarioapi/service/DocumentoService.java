package com.avaliacao.beneficiarioapi.service;
import com.avaliacao.beneficiarioapi.model.Documento;
import com.avaliacao.beneficiarioapi.repository.DocumentoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DocumentoService {

    private final DocumentoRepository documentoRepository;

    public DocumentoService(DocumentoRepository documentoRepository) {
        this.documentoRepository = documentoRepository;
    }

    public List<Documento> listaDocumentosPorBeneficiario(Long id){
        return documentoRepository.findByBeneficiarioId(id);
    }

    public Documento saveDocumento(Documento documento){
        return documentoRepository.save(documento);
    }

}
