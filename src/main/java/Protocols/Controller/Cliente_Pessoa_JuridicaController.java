package Protocols.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Cliente_Pessoa_JuridicaController {
   @RequestMapping("/CadastroPJ")
    public String form(){
        return "Cliente PJ";
    }
}
