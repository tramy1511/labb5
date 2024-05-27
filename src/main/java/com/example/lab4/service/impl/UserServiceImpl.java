package com.example.lab4.service.impl;

import com.example.lab4.Entity.User;
import com.example.lab4.reponsitory.UserRepository;
import com.example.lab4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepo;

    @Override
    public User doSaveUser(User user){

        if(user.getDiem() >= 8 ){
            user.setHocLuc("Gioi");
        } else if (user.getDiem() > 6 && user.getDiem() < 8){
            user.setHocLuc("Kha");
        } else {
            user.setHocLuc("Yeu");
        }

        return userRepo.saveAndFlush(user);
    };

}
