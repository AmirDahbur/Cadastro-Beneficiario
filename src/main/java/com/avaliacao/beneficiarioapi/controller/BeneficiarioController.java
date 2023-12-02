package com.avaliacao.beneficiarioapi.controller;
import com.avaliacao.beneficiarioapi.model.Beneficiario;
import com.avaliacao.beneficiarioapi.service.BeneficiarioService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/beneficiario")
public class BeneficiarioController {
    private final BeneficiarioService beneficiarioService;
    public BeneficiarioController(BeneficiarioService beneficiarioService) {
        this.beneficiarioService = beneficiarioService;
    }
    @GetMapping
    public List<Beneficiario> listaBeneficiario(){
        return beneficiarioService.searchAllBeneficiario();
    }

    @PostMapping
    public Beneficiario adicionarBeneficionario(@RequestBody Beneficiario beneficiario){
        return beneficiarioService.createBeneficiario(beneficiario);
    }
    @DeleteMapping("/{id}")
    public void  removerBeneficiario(@PathVariable Long id) {

        beneficiarioService.deleteBeneficiario(id);
    }
    @PutMapping("/{id}")
    public void atualizaBeneficiario(@PathVariable Long id, @RequestBody Beneficiario beneficiario){
        beneficiarioService.updateBeneficiario(id, beneficiario);
    }
}