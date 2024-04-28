package com.jcaido.TallerH2Render.DTOs.vehiculo;

import com.jcaido.TallerH2Render.models.Propietario;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class vehiculoBusquedasDTO {
    private Long id;
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private Propietario propietario;
}
