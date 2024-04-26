package com.jcaido.TallerH2Render.services.pieza;

import com.jcaido.TallerH2Render.DTOs.pieza.PiezaCrearDTO;
import com.jcaido.TallerH2Render.DTOs.pieza.PiezaDTO;

import java.util.List;

public interface PiezaService {

    PiezaDTO crearPieza(PiezaCrearDTO piezaCrearDTO);
    List<PiezaDTO> findAll();
    PiezaDTO findById(Long id);
    PiezaDTO findByReferencia(String referencia);
    List<PiezaDTO> findByNombre (String nombre);
    PiezaDTO modificarPieza(PiezaDTO piezaDTO);
    String deleteById(Long id);
}
