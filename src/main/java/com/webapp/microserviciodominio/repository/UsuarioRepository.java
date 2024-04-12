package com.webapp.microserviciodominio.repository;

import com.webapp.microserviciodominio.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
