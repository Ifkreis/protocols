package Protocols.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class ServicoController {

    @RequestMapping("/Servico")
    public String form() {return "Evento/newservico";}
}
