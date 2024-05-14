package com.jcaido.TallerH2Render.DTOs.proveedor;

import com.jcaido.TallerH2Render.DTOs.codigoPostal.CodigoPostalDTO;
import com.jcaido.TallerH2Render.models.CodigoPostal;
import com.jcaido.TallerH2Render.models.EntradaPieza;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProveedorBusquedasDTO {
    private Long id;
    private String nombre;
    private String dniCif;
    private String domicilio;
    private CodigoPostalDTO codigoPostal;
    private EntradaPieza entradaPieza;
}
