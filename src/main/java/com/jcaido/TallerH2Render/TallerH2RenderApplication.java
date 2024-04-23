package com.jcaido.TallerH2Render;

import com.jcaido.TallerH2Render.DTOs.codigoPostal.CodigoPostalDTO;
import com.jcaido.TallerH2Render.DTOs.propietario.PropietarioDTO;
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

	public static void main(String[] args) {
		SpringApplication.run(TallerH2RenderApplication.class, args);
	}

}
