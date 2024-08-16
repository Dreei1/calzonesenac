
package com.site.calzoneSENAC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GeralController {
      @GetMapping("/home")
    public String mostraHome() {
        return "home";
    }
    
    @GetMapping("/pedido")
    public String mostraPedido() {
        return "pedido";
    }

    @GetMapping("/cardapio")
    public String mostraCardapio() {
        return "cardapio";
    }

}
