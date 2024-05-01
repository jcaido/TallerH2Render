package com.jcaido.TallerH2Render.services.facturaCliente;

import com.jcaido.TallerH2Render.DTOs.facturaCliente.FacturaClienteCrearDTO;
import com.jcaido.TallerH2Render.DTOs.facturaCliente.FacturaClienteDTO;
import com.jcaido.TallerH2Render.DTOs.facturaCliente.FacturaClientesBusquedasDTO;

import java.time.LocalDate;
import java.util.List;

public interface FacturaClienteService {

    FacturaClienteDTO crearFacturaCliente(FacturaClienteCrearDTO facturaClienteCrearDTO, Long idPropietario, Long idOrdenReparacion);
    List<FacturaClientesBusquedasDTO> findAll();
    List<FacturaClientesBusquedasDTO> obtenerFacturasClientesEntreFechas(LocalDate fechaFacturaInicial, LocalDate fechaFacturaFinal);
    List<FacturaClientesBusquedasDTO> obtenerFacturasPorClienteEntreFechas(Long idCliente, LocalDate fechaFacturaInicial, LocalDate fechaFacturaFinal);
    FacturaClientesBusquedasDTO findById(Long id);
    FacturaClientesBusquedasDTO obtenerUltimaFacturaCliente();
    FacturaClienteDTO modificarFacturaCliente(FacturaClienteDTO facturaClienteDTO, Long idOrdenReparacion);
    FacturaClienteDTO modificarFacturaClienteNoOR(FacturaClienteDTO facturaClienteDTO);
    String eliminarFacturaCliente(Long id);
}
