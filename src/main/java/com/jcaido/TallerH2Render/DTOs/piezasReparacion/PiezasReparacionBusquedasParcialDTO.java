package com.jcaido.TallerH2Render.DTOs.piezasReparacion;

import com.jcaido.TallerH2Render.models.Pieza;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PiezasReparacionBusquedasParcialDTO {
    private Long id;
    private Integer cantidad;
    private Pieza pieza;
}
