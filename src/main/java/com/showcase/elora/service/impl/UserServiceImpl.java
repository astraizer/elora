package com.showcase.elora.service.impl;

import com.showcase.elora.persistance.model.User;
import com.showcase.elora.persistance.repository.UserRepository;
import com.showcase.elora.persistance.vo.request.UserFilterVO;
import com.showcase.elora.persistance.vo.request.UserVO;
import com.showcase.elora.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<User> getAllUser() {
        return this.userRepository.findAll();
    }

    @Override
    public User getUser(UserFilterVO userFilter) {
        return this.userRepository.findByEmail(userFilter.email).orElse(null);
    }

    @Override
    public User register(UserVO user) {
        User newUser=new User();
        newUser.setEmail(user.email);
        newUser.setGender(user.gender);
        newUser.setPhone(user.phone);
        newUser.setRoleId("");
        newUser.setName(user.name);
        this.userRepository.save(newUser);
        return newUser;
    }


    @Override
    public Object getUserByID(String ID) {
        return this.userRepository.findByID(ID);
    }

    @Override
    public Object forgetPassword(String email) {
        return null;
    }

    @Override
    public Object resetPassword(String code) {
        return null;
    }
}
