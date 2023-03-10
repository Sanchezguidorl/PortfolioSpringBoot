
package com.portfolio.GuidoSanchez.repositories;

import com.portfolio.GuidoSanchez.models.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudioRepository extends JpaRepository<Estudio, Long>{
    
}
