package com.jcaido.TallerH2Render.services.vehiculo;

import com.jcaido.TallerH2Render.DTOs.vehiculo.VehiculoBusquedasDTO;
import com.jcaido.TallerH2Render.DTOs.vehiculo.VehiculoBusquedasParcialDTO;
import com.jcaido.TallerH2Render.DTOs.vehiculo.VehiculoCrearDTO;
import com.jcaido.TallerH2Render.DTOs.vehiculo.VehiculoDTO;

import java.util.List;

public interface VehiculoService {
    VehiculoDTO crearVehiculo(VehiculoCrearDTO vehiculoCrearDTO, Long id_propietario);
    List<VehiculoBusquedasDTO> findAll();
    List<VehiculoBusquedasParcialDTO> findAllPartial();
    VehiculoBusquedasDTO findById(Long id);
    VehiculoBusquedasDTO findByMatricula(String matricula);
    List<VehiculoBusquedasDTO> findByMarca(String marca);
    List<VehiculoBusquedasDTO> findByMarcaAndModelo(String marca, String modelo);
    List<VehiculoBusquedasParcialDTO> findByMarcaModeloPartial(String marca, String modelo);
    String deleteById(Long  id);
    List<VehiculoBusquedasDTO> obtenerVehiculosPorPropietarioSQL(Long id_propietario);
    List<VehiculoBusquedasDTO> obtenerVehiculosPorPropietarioHQL(Long id_propietario);
    List<VehiculoBusquedasParcialDTO> obtenerVehiculosPorPropietarioHQLParcial(Long id_propietario);
    VehiculoDTO modificarVehiculo(VehiculoDTO vehiculoDTO, Long id_propietario);
}
