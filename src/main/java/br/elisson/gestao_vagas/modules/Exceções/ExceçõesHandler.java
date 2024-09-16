package br.elisson.gestao_vagas.modules.Exceções;

import java.util.ArrayList;
import java.util.List;


import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceçõesHandler<MensagemDeErroDTO> {

    private MessageSource MessageSource;


    public ExceçõesHandler(MessageSource message){
        this.MessageSource = message;
    }

   
    @ExceptionHandler(MethodArgumentNotValidException.class)


    public ResponseEntity<List<MensgemDeErroDTO>> handleMethodArgumentNotValidException(MethodArgumentNotValidException e){

        List<MensgemDeErroDTO> dto = new ArrayList<>();


          e.getBindingResult().getFieldErrors().forEach(err ->extracted(dto, err));

        return new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
    }


    private void extracted(List<MensgemDeErroDTO> dto, FieldError err) {
        String message = MessageSource.getMessage(err, LocaleContextHolder.getLocale());
        MensgemDeErroDTO erro = new  MensgemDeErroDTO(message,err.getField());
        dto.add(erro);
    }


  
}
