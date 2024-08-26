package com.site.calzoneSENAC.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;
import lombok.Data;

@Data
@Entity
@Table(name = "Pedido")
public class Pedido {
    
    @Id
    @TableGenerator(name = "tabelaGenerator", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.TABLE, generator="tabelaGenerator")
    Integer id;
    String nome;
    String endereco;
    String telefone;
    String metodoPag;
    String valorPedido;
    String idItemPedido;
}
