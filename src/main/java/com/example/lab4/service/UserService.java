package com.example.lab4.service;

import com.example.lab4.Entity.User;

import java.util.List;

public interface UserService {

    User doSaveUser(User user);
    List<User> finByUserName(String userName);
    List<User> getAllUser();
    void  doGetDelete(int id);

}
