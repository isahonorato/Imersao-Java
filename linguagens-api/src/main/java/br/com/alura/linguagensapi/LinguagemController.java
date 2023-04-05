package br.com.alura.linguagensapi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.Linguagem;

@RestController
public class LinguagemController {

    private List<Linguagem> linguagens =
    List.of(
        new Linguagem("Java", "https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg", "1"),
        new Linguagem("C#", "https://raw.githubusercontent.com/devicons/devicon/master/icons/csharp/csharp-original.svg", "2")
    );

    @GetMapping(value="/linguagem-preferida")
    public String processaLinguagemPreferida(){
        return "Oi";
    }

    @GetMapping("/linguagens")
    public List<Linguagem> obterLinguagens(){
        return linguagens;
    }
}
