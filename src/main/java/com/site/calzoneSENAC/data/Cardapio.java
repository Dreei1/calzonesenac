
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
@Table(name = "Cardapio")
public class Cardapio {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String nomeProduto;
    double valor;
    String descricao;
}
