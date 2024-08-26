
package com.site.calzoneSENAC.Controller;

import com.site.calzoneSENAC.data.Pedido;
import com.site.calzoneSENAC.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class GeralController {
    
    @Autowired
    PedidoService pedidoService;
    
      @GetMapping("/")
    public String mostraHome() {
        return "home";
    }
    
    @GetMapping("/pedido")
    public String cadastrarPedido(Model model) {
        Pedido pedir = new Pedido();
        model.addAttribute(pedir);
        return "pedidos";
    }

    @GetMapping("/cardapio")
    public String mostraCardapio() {
        return "cardapio";
    }
    
    @PostMapping("/salvarPedido") 
    public String salvarPedido(@ModelAttribute("pedido") Pedido pedir) {
        pedidoService.criarPedido(pedir);
        return "redirect:/pedido";
    }
}


