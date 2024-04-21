package com.jcaido.TallerH2Render.repositories;

import com.jcaido.TallerH2Render.models.CodigoPostal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodigoPostalRepository extends JpaRepository<CodigoPostal, Long> {
}
