package com.jcaido.TallerH2Render.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "facturas_clientes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class FacturaCliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne()
    @JoinColumn(name = "propietario_id")
    private Propietario propietario;
    @Column(name = "fecha_factura")
    private LocalDate fechaFactura;
    @Column(name="serie_factura")
    private String serie;
    @Column(name = "numero_factura")
    private Long numeroFactura;
    @Column(name = "tipo_iva")
    private Integer tipoIVA;
    @OneToOne()
    private OrdenReparacion ordenReparacion;
}
