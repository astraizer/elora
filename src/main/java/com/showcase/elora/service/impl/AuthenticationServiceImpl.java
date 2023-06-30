package com.showcase.elora.service.impl;

import com.showcase.elora.persistance.model.User;
import com.showcase.elora.persistance.repository.UserRepository;
import com.showcase.elora.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JWTServiceImpl jwtService;
    private final AuthenticationManager authenticationManager;
    @Override
    public User register() {
        return null;
    }

    @Override
    public String authenticate(String email,String password) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(email,password)
        );
        var user = userRepository.findByEmail(email).orElseThrow();
        return jwtService.generateToken(user);
    }
}
