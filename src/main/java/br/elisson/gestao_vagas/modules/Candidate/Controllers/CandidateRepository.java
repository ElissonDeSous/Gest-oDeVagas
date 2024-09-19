package br.elisson.gestao_vagas.modules.Candidate.Controllers;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.elisson.gestao_vagas.modules.Candidate.CandidatoEntity;

public interface  CandidateRepository extends JpaRepository<CandidatoEntity, UUID> {
    
}
