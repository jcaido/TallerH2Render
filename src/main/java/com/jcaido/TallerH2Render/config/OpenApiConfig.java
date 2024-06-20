package com.jcaido.TallerH2Render.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openAPI() {

        Contact contact = new Contact();
        contact.setEmail("crisrogar@gmail.com");
        contact.setName("Cristóbal Rosa Arjona");
        contact.setUrl("https://github.com/jcaido");

        Info info = new Info()
                .title("Mi Taller API REST")
                .version("1.0")
                .contact(contact)
                .description("API REST taller de reparación de vehículos");

        return new OpenAPI().info(info);
    }
}
