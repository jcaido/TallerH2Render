package com.jcaido.TallerH2Render.services.piezasReparacion;

import com.jcaido.TallerH2Render.DTOs.piezasReparacion.PiezasReparacionBusquedasDTO;
import com.jcaido.TallerH2Render.DTOs.piezasReparacion.PiezasReparacionBusquedasParcialDTO;
import com.jcaido.TallerH2Render.DTOs.piezasReparacion.PiezasReparacionCrearDTO;
import com.jcaido.TallerH2Render.DTOs.piezasReparacion.PiezasReparacionDTO;

import java.time.LocalDate;
import java.util.List;

public interface PiezasReparacionService {

    PiezasReparacionDTO crearPiezasReparacion(PiezasReparacionCrearDTO piezasReparacionCrearDTO, Long id_ordenReparacion, Long id_pieza);
    List<PiezasReparacionBusquedasParcialDTO> findAll();
    PiezasReparacionBusquedasParcialDTO findById(Long id);
    List<PiezasReparacionBusquedasParcialDTO> obtenerPiezasReparacionPorOrdenReparacion(Long id);
    List<PiezasReparacionBusquedasParcialDTO> obtenerPiezasReparacionPorPiezaHQL(Long id_pieza);
    List<PiezasReparacionBusquedasDTO> obtenerPiezasReparacionPorOrdenReparacion(LocalDate fecha);
    List<PiezasReparacionBusquedasDTO> obtenerPiezasReparacionPorPiezaYOrdenReparacion(String referencia);
    String deleteById(Long id);
}
