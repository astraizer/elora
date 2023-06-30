package com.showcase.elora.service;

import com.showcase.elora.persistance.model.User;

public interface AuthenticationService {

    User register();

    String authenticate(String email,String password);
}
