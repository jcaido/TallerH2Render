package com.jcaido.TallerH2Render.services.piezasReparacion;

import com.jcaido.TallerH2Render.DTOs.piezasReparacion.PiezasReparacionBusquedasDTO;
import com.jcaido.TallerH2Render.DTOs.piezasReparacion.PiezasReparacionBusquedasParcialDTO;
import com.jcaido.TallerH2Render.DTOs.piezasReparacion.PiezasReparacionCrearDTO;
import com.jcaido.TallerH2Render.DTOs.piezasReparacion.PiezasReparacionDTO;
import com.jcaido.TallerH2Render.repositories.PiezaRepository;
import com.jcaido.TallerH2Render.repositories.PiezasReparacionRepository;
import jakarta.persistence.EntityManager;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PiezasReparacionServiceImpl implements PiezasReparacionService {

    private final PiezasReparacionRepository piezasReparacionRepository;
    //private final OrdenReparacionRepository ordenReparacionRepository;
    private final PiezaRepository piezaRepository;
    private final ModelMapper modelMapper;
    private final EntityManager entityManager;

    public PiezasReparacionServiceImpl(PiezasReparacionRepository piezasReparacionRepository, PiezaRepository piezaRepository, ModelMapper modelMapper, EntityManager entityManager) {
        this.piezasReparacionRepository = piezasReparacionRepository;
        this.piezaRepository = piezaRepository;
        this.modelMapper = modelMapper;
        this.entityManager = entityManager;
    }


    @Override
    public PiezasReparacionDTO crearPiezasReparacion(PiezasReparacionCrearDTO piezasReparacionCrearDTO, Long id_ordenReparacion, Long id_pieza) {
        return null;
    }

    @Override
    public List<PiezasReparacionBusquedasParcialDTO> findAll() {
        return null;
    }

    @Override
    public PiezasReparacionBusquedasParcialDTO findById(Long id) {
        return null;
    }

    @Override
    public List<PiezasReparacionBusquedasParcialDTO> obtenerPiezasReparacionPorOrdenReparacion(Long id) {
        return null;
    }

    @Override
    public List<PiezasReparacionBusquedasParcialDTO> obtenerPiezasReparacionPorPiezaHQL(Long id_pieza) {
        return null;
    }

    @Override
    public List<PiezasReparacionBusquedasDTO> obtenerPiezasReparacionPorOrdenReparacion(LocalDate fecha) {
        return null;
    }

    @Override
    public List<PiezasReparacionBusquedasDTO> obtenerPiezasReparacionPorPiezaYOrdenReparacion(String referencia) {
        return null;
    }

    @Override
    public String deleteById(Long id) {
        return null;
    }
}
