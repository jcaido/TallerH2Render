package com.jcaido.TallerH2Render.controller;

import com.jcaido.TallerH2Render.DTOs.codigoPostal.CodigoPostalDTO;
import com.jcaido.TallerH2Render.models.CodigoPostal;
import com.jcaido.TallerH2Render.repositories.CodigoPostalRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/codigosPostales")
public class CodigoPostalController {

    private final CodigoPostalRepository codigoPostalRepository;
    private  final ModelMapper modelMapper;

    public CodigoPostalController(CodigoPostalRepository codigoPostalRepository, ModelMapper modelMapper) {
        this.codigoPostalRepository = codigoPostalRepository;
        this.modelMapper = modelMapper;
    }

    @Operation(summary = "Crear un nuevo Código Postal", description = "Crear un nuevo Código Postal")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "código postal creado correctamente",
                    content = {
                            @Content(mediaType = "application/json",
                                    schema = @Schema(implementation = CodigoPostalDTO.class))
                    }),
            @ApiResponse(responseCode = "400",
                    description = "Bad Request",
                    content = @Content),
            @ApiResponse(responseCode = "409",
                    description = "Dato/s invalidos",
                    content = @Content),
    })
    @PostMapping()
    public String crearCodigoPostal() {

        return "probando";
    }


    @Operation(summary = "Obtener todos los Códigos Postales", description = "Obtener todos los Códigos Postales")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Codigos Postales obtenidos correctamente",
                    content = {
                            @Content(mediaType = "application/json",
                                    schema = @Schema(implementation = CodigoPostalDTO.class))
                    })
    })
    @GetMapping()
    public List<CodigoPostalDTO> obtenerTodosLosCodigosPostales() {

        List<CodigoPostal> codigosPostales = codigoPostalRepository.findAll();

        return  codigosPostales.stream().map(codigoPostal-> modelMapper.map(codigoPostal, CodigoPostalDTO.class)).toList();
    }
}
