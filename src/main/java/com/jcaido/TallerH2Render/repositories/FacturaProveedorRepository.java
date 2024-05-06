package com.jcaido.TallerH2Render.repositories;

import com.jcaido.TallerH2Render.models.FacturaProveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaProveedorRepository extends JpaRepository<FacturaProveedor, Long> {
    FacturaProveedor findByNumeroFactura(String numeroFactura);
    boolean existsById(Long id);
}
