package com.site.calzoneSENAC.service;

import com.site.calzoneSENAC.data.Pedido;
import com.site.calzoneSENAC.repository.PedidoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    
    @Autowired
    PedidoRepository pedidoRepository;
    
    public Pedido criarPedido(Pedido pedido) {
        pedidoRepository.save(pedido);
        return pedido;
    }
    
    public List<Pedido>listarPedidos() {
        return pedidoRepository.findAll();
    }
}
