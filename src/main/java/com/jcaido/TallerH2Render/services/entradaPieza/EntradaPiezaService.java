package com.jcaido.TallerH2Render.services.entradaPieza;

import com.jcaido.TallerH2Render.DTOs.entradaPieza.EntradaPiezaBusquedasDTO;
import com.jcaido.TallerH2Render.DTOs.entradaPieza.EntradaPiezaCrearDTO;
import com.jcaido.TallerH2Render.DTOs.entradaPieza.EntradaPiezaDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EntradaPiezaService {
    EntradaPiezaDTO crearEntradaPieza(EntradaPiezaCrearDTO entradaPiezaCrearDTO, Long idPieza, Long idAlbaranProvedor);
    List<EntradaPiezaBusquedasDTO> findAll();
    ResponseEntity<EntradaPiezaBusquedasDTO> findById(Long id);
    List<EntradaPiezaBusquedasDTO> obtenerEntradasPorPiezaHQL(Long id_pieza);
    List<EntradaPiezaBusquedasDTO> obtenerEntradasPiezasPorAlbaranProveedorHQL(Long id_pieza);
    EntradaPiezaDTO modificarEntradaPieza(EntradaPiezaDTO entradaPiezaDTO, Long idPieza);
    String deleteById(Long id);
}
