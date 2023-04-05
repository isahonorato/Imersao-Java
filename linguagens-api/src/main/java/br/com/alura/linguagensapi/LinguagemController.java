package br.com.alura.linguagensapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {
    @GetMapping(value="/linguagem-preferida")
    public String processaLinguagemPreferida(){
        return "Oi";
    }

}
