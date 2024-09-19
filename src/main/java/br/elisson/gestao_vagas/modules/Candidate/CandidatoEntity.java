package br.elisson.gestao_vagas.modules.Candidate;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

// getters e setters
@Data


@Entity(name = "candidate")
public class CandidatoEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
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

    @CreationTimestamp
   private LocalDateTime createTime;


}
