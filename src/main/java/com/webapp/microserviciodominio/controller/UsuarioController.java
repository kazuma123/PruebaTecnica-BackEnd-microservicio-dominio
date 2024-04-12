package com.webapp.microserviciodominio.controller;

import com.webapp.microserviciodominio.dto.UsuarioDto;
import com.webapp.microserviciodominio.service.IUsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/usuario")
public class UsuarioController {
    private final IUsuarioService service;
    @PostMapping("/insert")
    public ResponseEntity<?> insert(@RequestBody UsuarioDto requestData) {
       return ResponseEntity.ok(service.create(requestData));
    }
}
