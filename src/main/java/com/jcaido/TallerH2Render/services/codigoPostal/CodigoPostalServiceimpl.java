package com.jcaido.TallerH2Render.services.codigoPostal;

import com.jcaido.TallerH2Render.DTOs.codigoPostal.CodigoPostalCrearDTO;
import com.jcaido.TallerH2Render.DTOs.codigoPostal.CodigoPostalDTO;
import com.jcaido.TallerH2Render.models.CodigoPostal;
import com.jcaido.TallerH2Render.repositories.CodigoPostalRepository;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class CodigoPostalServiceimpl implements CodigoPostalService{

    private final CodigoPostalRepository codigoPostalRepository;
    //private final PropietarioService propietarioService;
    private final CodigoPostalValidacionesUniqueService codigoPostalValidacionesUniqueService;
    private  final ModelMapper modelMapper;

    public CodigoPostalServiceimpl(CodigoPostalRepository codigoPostalRepository, CodigoPostalValidacionesUniqueService codigoPostalValidacionesUniqueService, ModelMapper modelMapper) {
        this.codigoPostalRepository = codigoPostalRepository;
        this.codigoPostalValidacionesUniqueService = codigoPostalValidacionesUniqueService;
        this.modelMapper = modelMapper;
    }


    @Override
    public CodigoPostalDTO crearCodigoPostal(CodigoPostalCrearDTO codigoPostalCrearDTO) {
        if (codigoPostalRepository.existsByCodigo(codigoPostalCrearDTO.getCodigo()))
            throw new ResponseStatusException(HttpStatus.CONFLICT, "El numero del codigo postal ya existe");

        if (codigoPostalRepository.existsByLocalidad(codigoPostalCrearDTO.getLocalidad()))
            throw new ResponseStatusException(HttpStatus.CONFLICT, "la localidad del codigo postal ya existe");

        CodigoPostal codigoPostal = modelMapper.map(codigoPostalCrearDTO, CodigoPostal.class);
        CodigoPostal nuevoCodigoPostal = codigoPostalRepository.save(codigoPostal);
        CodigoPostalDTO codigoPostalRespuesta = modelMapper.map(nuevoCodigoPostal, CodigoPostalDTO.class);
        return codigoPostalRespuesta;
    }

    @Override
    public List<CodigoPostalDTO> findAll() {
        List<CodigoPostal> codigosPostales = codigoPostalRepository.findAll();

        return  codigosPostales.stream().map(codigoPostal-> modelMapper.map(codigoPostal, CodigoPostalDTO.class)).toList();
    }

    @Override
    public Page<CodigoPostalDTO> findAllPageable(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<CodigoPostal> codigosPostales = codigoPostalRepository.findAll(pageable);

        return codigosPostales.map(codigoPostal -> new CodigoPostalDTO(codigoPostal));
    }

    @Override
    public CodigoPostalDTO findById(Long id) {
        return null;
    }

    @Override
    public CodigoPostalDTO findByCodigo(String codigo) {
        return null;
    }

    @Override
    public List<CodigoPostalDTO> findByProvincia(String provincia) {
        return null;
    }

    @Override
    public CodigoPostalDTO findByLocalidad(String localidad) {
        return null;
    }

    @Override
    public String deleteById(Long id) {
        return null;
    }

    @Override
    public CodigoPostalDTO modificarCodigoPostal(CodigoPostalDTO codigoPostalDTO) {
        return null;
    }
}
