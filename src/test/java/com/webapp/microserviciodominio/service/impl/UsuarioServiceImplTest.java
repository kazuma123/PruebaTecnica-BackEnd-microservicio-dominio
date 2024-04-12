package com.webapp.microserviciodominio.service.impl;

import com.webapp.microserviciodominio.data.UsuarioData;
import com.webapp.microserviciodominio.dto.UsuarioDto;
import com.webapp.microserviciodominio.model.Usuario;
import com.webapp.microserviciodominio.repository.UsuarioRepository;
import com.webapp.microserviciodominio.service.UsuarioServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static com.webapp.microserviciodominio.data.UsuarioData.*;
@ExtendWith(MockitoExtension.class)
public class UsuarioServiceImplTest {
    @Mock
    UsuarioRepository usuarioRepository;

    @Mock
    ModelMapper modelMapper;
    @InjectMocks
    UsuarioServiceImpl serviceImpl;

    @Test
    void insert(){
        when(modelMapper.map(ArgumentMatchers.any(), ArgumentMatchers.eq(Usuario.class))).thenReturn(USUARIO_01().get());
        when(usuarioRepository.save(ArgumentMatchers.any(Usuario.class))).thenReturn(USUARIO_01().get());
        when(modelMapper.map(ArgumentMatchers.any(), ArgumentMatchers.eq(UsuarioDto.class))).thenReturn(USUARIODTO().get());
        UsuarioDto newUser = serviceImpl.create(USUARIODTO().get());

        assertNotNull(newUser);
        assertNotEquals("John Doe", newUser.getNombre());
        assertNotNull(newUser.getId());
    }
}
