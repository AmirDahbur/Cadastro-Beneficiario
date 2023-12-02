package com.avaliacao.beneficiarioapi.service;
import com.avaliacao.beneficiarioapi.model.Beneficiario;
import com.avaliacao.beneficiarioapi.repository.BeneficiarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class BeneficiarioService {
    private final BeneficiarioRepository beneficiarioRepository;
    private final DocumentoService documentoService;
    public BeneficiarioService(BeneficiarioRepository beneficiarioRepository, DocumentoService documentoService) {
        this.beneficiarioRepository = beneficiarioRepository;
        this.documentoService = documentoService;
    }
    public List<Beneficiario> searchAllBeneficiario(){

        return beneficiarioRepository.findAll();
    }
    public Beneficiario createBeneficiario(Beneficiario beneficiario){
        Beneficiario beneficiaryInsertions = beneficiarioRepository.save(beneficiario);
        beneficiario.getDocumentos().forEach(documento -> {
            documento.setBeneficiario(beneficiaryInsertions);
            documentoService.saveDocumento(documento);
        });
        return beneficiario;
    }
    public void deleteBeneficiario(Long id) {
        beneficiarioRepository.deleteById(id);
    }
    public Beneficiario updateBeneficiario(Long id, Beneficiario newBeneficiario){
       Optional<Beneficiario> beneficiarioExistenteOptional = beneficiarioRepository.findById(id);

       if(beneficiarioExistenteOptional.isPresent()){
           Beneficiario beneficiarioExistente = beneficiarioExistenteOptional.get();

           beneficiarioExistente.setNome(newBeneficiario.getNome());
           beneficiarioExistente.setTelefone(newBeneficiario.getTelefone());
           beneficiarioExistente.setDataNascimento(newBeneficiario.getDataNascimento());

           beneficiarioRepository.save(beneficiarioExistente);

           return beneficiarioExistente;
       }
       else{
           return null;
       }
    }
}