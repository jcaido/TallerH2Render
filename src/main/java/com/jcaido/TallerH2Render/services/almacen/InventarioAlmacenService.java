package com.jcaido.TallerH2Render.services.almacen;

import com.jcaido.TallerH2Render.DTOs.almacen.MovimientoAlmacenDTO;
import com.jcaido.TallerH2Render.DTOs.almacen.MovimientoPiezaDTO;

import java.time.LocalDate;
import java.util.List;

public interface InventarioAlmacenService {
    List<MovimientoAlmacenDTO> obtenerInventarioAlmacenFecha(LocalDate fecha);
    List<MovimientoPiezaDTO> obtenerMovimientosPorPieza(String referencia);
}
