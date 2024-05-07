package com.jcaido.TallerH2Render.services.facturaProveedor;

import com.jcaido.TallerH2Render.DTOs.facturaProveedor.FacturaProveedorBusquedasDTO;
import com.jcaido.TallerH2Render.DTOs.facturaProveedor.FacturaProveedorCrearDTO;
import com.jcaido.TallerH2Render.DTOs.facturaProveedor.FacturaProveedorDTO;

import java.time.LocalDate;
import java.util.List;

public interface FacturaProveedorService {
    FacturaProveedorDTO crearFacturaProveedor(FacturaProveedorCrearDTO facturaProveedorCrearDTO, Long idProveedor);
    List<FacturaProveedorBusquedasDTO> findAll();
    FacturaProveedorBusquedasDTO findById(Long id);
    List<FacturaProveedorBusquedasDTO> obtenerFacturasProveedoresEntreFechas(LocalDate fechaFacturaInicial, LocalDate fechaFacturaFinal);
    List<FacturaProveedorBusquedasDTO> obtenerFacturasPorProveedorEntreFechas(Long idProveedor, LocalDate fechaFacturaInicial, LocalDate fechaFacturaFinal);
    FacturaProveedorDTO modificarFacturaProveedor(FacturaProveedorDTO facturaProveedorDTO, Long idProveedor);
    String deleteById(Long id);
}
