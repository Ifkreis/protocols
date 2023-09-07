package Protocols.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrcamentoController {
    @RequestMapping("/Orcamento")
    public String form(){
        return "form Orcamento";
    }
}
