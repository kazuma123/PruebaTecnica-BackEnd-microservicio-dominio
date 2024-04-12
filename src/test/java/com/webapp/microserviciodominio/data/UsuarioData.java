package com.webapp.microserviciodominio.data;

import com.webapp.microserviciodominio.dto.UsuarioDto;
import com.webapp.microserviciodominio.model.Usuario;

import java.util.Optional;

public class UsuarioData {
    public static Optional<UsuarioDto> USUARIODTO() {
        return Optional.of(UsuarioDto.builder()
                        .id(1L)
                        .nombre("POL")
                        .apellido("QUISPE")
                        .email("correo@gmail.com")
                        .edad(23)
                .build());
    }
    public static Optional<Usuario> USUARIO_01() {
        return Optional.of(Usuario.builder()
                        .id(1L)
                .nombre("POL")
                .apellido("QUISPE")
                .email("correo@gmail.com")
                .edad(23)
                .build());
    }
    public static Optional<Usuario> USUARIO_02() {
        return Optional.of(Usuario.builder()
                .id(2L)
                .nombre("ANGLE")
                .apellido("VARGAS")
                .email("avargas@gmail.com")
                .edad(43)
                .build());
    }
}
