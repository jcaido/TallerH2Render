package com.jcaido.TallerH2Render.DTOs.facturaProveedor;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jcaido.TallerH2Render.DTOs.proveedor.ProveedorBusquedasDTO;
import com.jcaido.TallerH2Render.models.Proveedor;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FacturaProveedorDTO {
    private Long id;
    @JsonFormat(pattern = "dd-MM-yyyy")
    @NotNull(message = "la fecha de la factura no puede ser nula")
    private LocalDate fechaFactura;
    private String numeroFactura;
    private Integer tipoIVA;
    private Boolean contabilizada = false;
    private ProveedorBusquedasDTO proveedor;
}
