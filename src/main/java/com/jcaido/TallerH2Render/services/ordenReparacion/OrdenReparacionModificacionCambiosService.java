package com.jcaido.TallerH2Render.services.ordenReparacion;

import com.jcaido.TallerH2Render.models.Vehiculo;
import com.jcaido.TallerH2Render.repositories.VehiculoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrdenReparacionModificacionCambiosService {

    private final VehiculoRepository vehiculoRepository;

    public OrdenReparacionModificacionCambiosService(VehiculoRepository vehiculoRepository) {
        this.vehiculoRepository = vehiculoRepository;
    }

    public boolean validacionVehiculo(Long idVehiculo) {
        Optional<Vehiculo> vehiculo = vehiculoRepository.findById(idVehiculo);

        if (vehiculo.isPresent())
            return true;

        return false;
    }
}
