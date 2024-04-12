package com.webapp.microserviciodominio.dto;

import lombok.Data;

@Data
public class UsuarioDto {
    private String nombre;
    private String email;
    private String apellido;
    private Integer edad;
}
