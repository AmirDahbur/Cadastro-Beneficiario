package com.avaliacao.beneficiarioapi.controller;
import com.avaliacao.beneficiarioapi.model.Documento;
import com.avaliacao.beneficiarioapi.service.DocumentoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/documento")
public class DocumentoController {

  private final  DocumentoService documentoService;

    public DocumentoController(DocumentoService documentoService) {
        this.documentoService = documentoService;
    }

    @GetMapping("/{id}")
    public List<Documento> listaDocumentosPorBeneficiario(@PathVariable Long id){
        return documentoService.listaDocumentosPorBeneficiario(id);
    }


}
