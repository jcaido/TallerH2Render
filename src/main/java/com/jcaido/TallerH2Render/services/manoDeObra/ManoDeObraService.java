package com.jcaido.TallerH2Render.services.manoDeObra;

import com.jcaido.TallerH2Render.DTOs.manoDeObra.ManoDeObraCrearDTO;
import com.jcaido.TallerH2Render.DTOs.manoDeObra.ManoDeObraDTO;

import java.util.List;

public interface ManoDeObraService {
    ManoDeObraDTO crearManoDeObra(ManoDeObraCrearDTO manoDeObraCrearDTO);
    List<ManoDeObraDTO> findAll();
    ManoDeObraDTO findByPrecioHoraClienteTallerActual(Boolean precioHoraClienteTallerActual);
}
