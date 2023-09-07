package Protocols.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Cliente_Pessoa_FisicaController {
   @RequestMapping("/cadastroPF")
    public String form(){
        return "Evento/CadastroPF";
    }
}
