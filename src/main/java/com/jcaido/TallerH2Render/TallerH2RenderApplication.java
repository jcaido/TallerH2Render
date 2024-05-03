package com.jcaido.TallerH2Render;

import com.jcaido.TallerH2Render.DTOs.codigoPostal.CodigoPostalDTO;
import com.jcaido.TallerH2Render.DTOs.entradaPieza.EntradaPiezaDTO;
import com.jcaido.TallerH2Render.DTOs.pieza.PiezaDTO;
import com.jcaido.TallerH2Render.DTOs.piezasReparacion.PiezasReparacionDTO;
import com.jcaido.TallerH2Render.DTOs.propietario.PropietarioDTO;
import com.jcaido.TallerH2Render.DTOs.proveedor.ProveedorDTO;
import com.jcaido.TallerH2Render.DTOs.vehiculo.VehiculoDTO;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TallerH2RenderApplication {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	@Bean
	public CodigoPostalDTO codigoPostalDTO() {
		return new CodigoPostalDTO();
	}
	@Bean
	public PropietarioDTO propietarioDTO() {
		return new PropietarioDTO();
	}
	@Bean
	public ProveedorDTO proveedorDTO() {
		return new ProveedorDTO();
	}
	@Bean
	public VehiculoDTO vehiculoDTO() {
		return new VehiculoDTO();
	}
	@Bean
	public PiezaDTO piezaDTO() {
		return new PiezaDTO();
	}
	@Bean
	public PiezasReparacionDTO piezasReparacionDTO() {
		return new PiezasReparacionDTO();
	}
	@Bean
	public EntradaPiezaDTO entradaPiezaDTO() {
		return new EntradaPiezaDTO();
	}



	public static void main(String[] args) {
		SpringApplication.run(TallerH2RenderApplication.class, args);
	}

}
