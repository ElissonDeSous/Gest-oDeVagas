package br.elisson.gestao_vagas.modules.Candidate.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.elisson.gestao_vagas.modules.Candidate.CandidatoEntity;


@RestController

@RequestMapping("/Candidatos")
public class CandidateController {
    
    @PostMapping("/")

    public String CriarCandidatos(@RequestBody CandidatoEntity criarCandidato){
         return "candidato cadastrado: " +  criarCandidato.getName() + "\n" + "candidato cadastrado: " +  criarCandidato.getUsername();
        
     
         
    }
}
