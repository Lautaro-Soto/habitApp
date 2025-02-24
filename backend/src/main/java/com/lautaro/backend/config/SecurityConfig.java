package com.lautaro.backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SecurityConfig implements WebMvcConfigurer {
    /**
     * Configure CORS mapping for the application.
     *
     * @param registry the CorsRegistry to configure
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Add a mapping for all paths
        registry.addMapping("/**")
                .allowedOrigins("*") // Agrega más si es necesario
                .allowedMethods("*") // Permite todos los métodos HTTP
                .allowedHeaders("*") // Permite todos los encabezados
                .allowCredentials(true); // Permitir credenciales si es necesario
    }
}
