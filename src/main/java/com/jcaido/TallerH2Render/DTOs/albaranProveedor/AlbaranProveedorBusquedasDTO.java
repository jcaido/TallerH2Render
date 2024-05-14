package com.jcaido.TallerH2Render.DTOs.albaranProveedor;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jcaido.TallerH2Render.DTOs.entradaPieza.EntradaPiezaBusquedasParcialDTO;
import com.jcaido.TallerH2Render.DTOs.proveedor.ProveedorBusquedasDTO;
import com.jcaido.TallerH2Render.models.FacturaProveedor;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AlbaranProveedorBusquedasDTO {
    private Long id;
    private ProveedorBusquedasDTO proveedor;
    @JsonFormat(pattern = "dd-MM-yyyy")
    @NotNull(message = "la fecha del albarán no puede ser nula")
    private LocalDate fechaAlbaran;
    private String numeroAlbaran;
    private Boolean facturado = false;
    private List<EntradaPiezaBusquedasParcialDTO> entradasPiezas;
    private FacturaProveedor facturaProveedor;
}
