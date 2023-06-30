package com.showcase.elora.service;

import com.showcase.elora.persistance.model.User;
import com.showcase.elora.persistance.vo.request.UserFilterVO;
import com.showcase.elora.persistance.vo.request.UserVO;

import java.util.List;

public interface UserService {

    List<User> getAllUser();

    Object getUser(UserFilterVO userFilter);

    User register(UserVO user);

    Object getUserByID(String ID);

    Object forgetPassword(String email);

    Object resetPassword(String code);
}
