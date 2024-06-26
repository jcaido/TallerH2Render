package com.jcaido.TallerH2Render.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "albaran_proveedor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class AlbaranProveedor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne()
    @JoinColumn(name = "proveedor_id")
    private Proveedor proveedor;
    @Column(name = "fecha_albaran")
    private LocalDate fechaAlbaran;
    @Column(name = "numero_albaran")
    private String numeroAlbaran;
    private Boolean facturado = false;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "albaranProveedor")
    private List<EntradaPieza> entradasPiezas = new ArrayList<>();
    //@OneToOne()
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne()
    @JoinColumn(name = "factura_proveedor_id")
    private FacturaProveedor facturaProveedor;
}
