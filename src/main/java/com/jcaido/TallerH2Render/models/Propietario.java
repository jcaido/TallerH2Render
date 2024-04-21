package com.jcaido.TallerH2Render.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "propietarios")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Propietario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @Column(name = "primer_apellido")
    private String primerApellido;
    @Column(name = "segundo_apellido")
    private String segundoApellido;
    @Column(unique = true)
    private String dni;
    private String domicilio;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne()
    @JoinColumn(name = "codigo_postal_id")
    private CodigoPostal codigoPostal;
}
