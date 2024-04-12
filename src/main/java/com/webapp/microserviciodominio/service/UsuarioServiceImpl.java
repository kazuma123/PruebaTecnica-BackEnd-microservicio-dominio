package com.webapp.microserviciodominio.service;

import com.webapp.microserviciodominio.dto.UsuarioDto;
import com.webapp.microserviciodominio.model.Usuario;
import com.webapp.microserviciodominio.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements IUsuarioService{
    private final UsuarioRepository usuarioRepository;
    private final ModelMapper modelMapper;
    @Override
    public UsuarioDto create(UsuarioDto dto) {

        Usuario usuario = usuarioRepository.save(modelMapper.map(dto, Usuario.class));
        System.out.println(usuario);
        return modelMapper.map(usuario, UsuarioDto.class);
    }
}
