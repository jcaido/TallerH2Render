package com.jcaido.TallerH2Render.repositories;

import com.jcaido.TallerH2Render.models.FacturaCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaClienteRepository extends JpaRepository<FacturaCliente, Long> {
}
