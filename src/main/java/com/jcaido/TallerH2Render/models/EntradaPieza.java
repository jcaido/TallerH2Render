package com.jcaido.TallerH2Render.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "entrada_pieza")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class EntradaPieza implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne()
    @JoinColumn(name = "pieza_id")
    private Pieza pieza;
    private Integer cantidad;
    @Column(name = "precio_entrada")
    private Double precioEntrada;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne()
    @JoinColumn(name = "albaran_proveedor_id")
    private AlbaranProveedor albaranProveedor;
}
