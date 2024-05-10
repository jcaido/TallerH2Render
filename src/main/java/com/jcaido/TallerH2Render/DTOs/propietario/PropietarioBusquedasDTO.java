package com.jcaido.TallerH2Render.DTOs.propietario;

import com.jcaido.TallerH2Render.DTOs.codigoPostal.CodigoPostalDTO;
import com.jcaido.TallerH2Render.models.CodigoPostal;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class PropietarioBusquedasDTO {
    private Long id;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String dni;
    private String domicilio;
    private CodigoPostalDTO codigoPostal;
}
