package br.elisson.gestao_vagas.modules.Candidate;

import java.util.UUID;

import lombok.Data;

// getters e setters
@Data
public class CandidatoEntity {
    private UUID id;
    private String name;
    private String username;
    private String email;
    private String password;
    private String description;
    private String Curriculum;




}
