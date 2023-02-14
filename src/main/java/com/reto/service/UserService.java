package com.reto.service;

import com.reto.model.UsuarioEntity;
import com.reto.repository.UserRepository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void save(UsuarioEntity user) {
        userRepository.save(user);
    }
}
