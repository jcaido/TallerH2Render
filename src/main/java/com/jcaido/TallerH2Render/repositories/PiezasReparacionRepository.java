package com.jcaido.TallerH2Render.repositories;

import com.jcaido.TallerH2Render.DTOs.almacen.MovimientoAlmacenDTO;
import com.jcaido.TallerH2Render.DTOs.almacen.MovimientoPiezaDTO;
import com.jcaido.TallerH2Render.models.PiezasReparacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PiezasReparacionRepository extends JpaRepository<PiezasReparacion, Long> {

    @Query("SELECT new com.jcaido.TallerH2Render.DTOs.almacen.MovimientoAlmacenDTO(" +
            " p.pieza.referencia, p.pieza.nombre, SUM(p.cantidad))" +
            " FROM PiezasReparacion AS p" +
            " WHERE p.ordenReparacion.fechaCierre <= :fecha" +
            " GROUP BY p.pieza.referencia, p.pieza.nombre")
    List<MovimientoAlmacenDTO> obtenerTotalPiezasReparacionFecha(@Param("fecha") LocalDate fecha);

    @Query("SELECT new com.jcaido.TallerH2Render.DTOs.almacen.MovimientoPiezaDTO(" +
            " p.ordenReparacion.fechaCierre, p.ordenReparacion.vehiculo.matricula, p.cantidad)" +
            " FROM PiezasReparacion AS p" +
            " WHERE p.pieza.referencia =:referencia")
    List<MovimientoPiezaDTO> obtenerPiezasReparacionPorPieza(@Param("referencia") String referencia);
}
