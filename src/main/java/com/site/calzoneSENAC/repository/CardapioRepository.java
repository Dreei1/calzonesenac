
package com.site.calzoneSENAC.repository;

import com.site.calzoneSENAC.data.Cardapio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardapioRepository extends JpaRepository<Cardapio, Integer> {
    
}
