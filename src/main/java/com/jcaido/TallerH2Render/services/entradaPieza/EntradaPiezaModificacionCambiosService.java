package com.jcaido.TallerH2Render.services.entradaPieza;

import com.jcaido.TallerH2Render.models.AlbaranProveedor;
import com.jcaido.TallerH2Render.models.EntradaPieza;
import com.jcaido.TallerH2Render.models.Pieza;
import com.jcaido.TallerH2Render.repositories.EntradaPiezaRepository;
import com.jcaido.TallerH2Render.repositories.PiezaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EntradaPiezaModificacionCambiosService {
    private final PiezaRepository piezaRepository;
    private final EntradaPiezaRepository entradaPiezaRepository;

    public EntradaPiezaModificacionCambiosService(PiezaRepository piezaRepository, EntradaPiezaRepository entradaPiezaRepository) {
        this.piezaRepository = piezaRepository;
        this.entradaPiezaRepository = entradaPiezaRepository;
    }

    public boolean validacionPieza(Long idPieza) {
        Optional<Pieza> pieza = piezaRepository.findById(idPieza);

        if (pieza.isPresent())
            return true;

        return false;
    }

    public boolean validaciionEntradaPiezaAlbaranFacturado(Long idPieza) {
        EntradaPieza entradaPieza = entradaPiezaRepository.findById(idPieza).get();
        AlbaranProveedor albaranProveedor = entradaPieza.getAlbaranProveedor();

        if (albaranProveedor.getFacturado())
            return true;

        return false;
    }
}
