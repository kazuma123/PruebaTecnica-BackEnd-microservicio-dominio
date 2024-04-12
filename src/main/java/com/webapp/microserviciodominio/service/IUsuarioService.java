package com.webapp.microserviciodominio.service;


import com.webapp.microserviciodominio.dto.UsuarioDto;

public interface IUsuarioService {
    UsuarioDto create(UsuarioDto dto);
}
