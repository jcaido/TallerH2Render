package com.jcaido.TallerH2Render.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orden_reparacion")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class OrdenReparacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fecha_apertura")
    private LocalDate fechaApertura;
    @Column(name = "fecha_cierre")
    private LocalDate fechaCierre;
    private String descripcion;
    private Long kilometros;
    private Double horas;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne()
    @JoinColumn(name = "mano_de_obra_id")
    private ManoDeObra manoDeObra;
    private Boolean cerrada;
    private Boolean facturada;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne()
    @JoinColumn(name = "vehiculo_id")
    private Vehiculo vehiculo;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "ordenReparacion")
    private List<PiezasReparacion> piezasReparacion = new ArrayList<>();
    @OneToOne(mappedBy = "ordenReparacion")
    private FacturaCliente facturaCliente;
}
