package br.elisson.gestao_vagas.modules.Candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

// getters e setters
@Data
public class CandidatoEntity {
    private UUID id;
    private String name;

    @NotBlank()
    @Pattern(regexp = "\\S+", message="o campo {username} não deve conter espaço")
    private String username;

    @Email(message = "o campo deve conter um email valido")
    private String email;

    @Length(min = 8 , max = 100, message = "a senha deve conter entre 8 a 100 caracteres")
    private String password;
    private String description;
    private String Curriculum;




}
