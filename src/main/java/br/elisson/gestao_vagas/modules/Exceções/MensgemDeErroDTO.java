package br.elisson.gestao_vagas.modules.Exceções;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MensgemDeErroDTO {

        private  String message;
        private  String field;

    MensgemDeErroDTO() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    

   

}
