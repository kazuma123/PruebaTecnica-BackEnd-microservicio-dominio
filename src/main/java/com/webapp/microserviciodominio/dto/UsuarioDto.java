package com.webapp.microserviciodominio.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto {
    private Long id;
    private String nombre;
    private String email;
    private String apellido;
    private Integer edad;
}
