package com.jcaido.TallerH2Render.DTOs.propietario;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class PropietarioDTO {
    private Long id;
    @NotBlank(message = "debe introducir el nombre")
    private String nombre;
    @NotBlank(message = "debe introducir el primer apellido")
    private String primerApellido;
    @NotBlank(message = "debe introducir el segundo apellido")
    private String segundoApellido;
    @NotBlank(message = "debe introducir el dni")
    private String dni;
    private String domicilio;
}
