package Protocols.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DispositivoController {
    @RequestMapping("/Dispositivo")
    public String form(){return "Evento/Dispositivo";}
}
