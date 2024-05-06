package com.jcaido.TallerH2Render.services.albaranProveedor;

import com.jcaido.TallerH2Render.DTOs.albaranProveedor.AlbaranProveedorBusquedasDTO;
import com.jcaido.TallerH2Render.DTOs.albaranProveedor.AlbaranProveedorBusquedasParcialDTO;
import com.jcaido.TallerH2Render.DTOs.albaranProveedor.AlbaranProveedorCrearDTO;
import com.jcaido.TallerH2Render.DTOs.albaranProveedor.AlbaranProveedorDTO;

import java.util.List;

public interface AlbaranProveedorService {
    AlbaranProveedorDTO crearAlbaranProveedor(AlbaranProveedorCrearDTO albaranProveedorCrearDTO, Long idProveedor);
    List<AlbaranProveedorBusquedasDTO> findAll();
    List<AlbaranProveedorBusquedasParcialDTO> findAllParcial();
    AlbaranProveedorBusquedasDTO findById(Long id);
    List<AlbaranProveedorBusquedasDTO> obtenerAlbaranesProveedorPorProveedorHQL(Long idProveedor);
    List<AlbaranProveedorBusquedasDTO> obtenerAlbaranesPtesFacturarPorProveedorHQL(Long idProveedor);
    List<AlbaranProveedorBusquedasDTO> obtenerAlbaranesProveedorPorFacturaProveedorHQL(Long idFactura);
    AlbaranProveedorDTO modificarAlbaranProveedor(AlbaranProveedorDTO albaranProveedorDTO, Long idProveedor);
    AlbaranProveedorDTO facturarAlbaranProveedor(Long idAlbaran, Long idFactura);
    AlbaranProveedorDTO noFacturarAlbaranProveedorFacturado(Long idAlbaran);
    String deleteById(Long  id);
}
