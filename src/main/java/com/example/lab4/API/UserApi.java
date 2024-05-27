package com.example.lab4.API;

import com.example.lab4.Entity.User;
import com.example.lab4.reponsitory.UserRepository;
import com.example.lab4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user-api")
public class UserApi {
    @Autowired
    private UserRepository userRepo;

    @Autowired
    private UserService userService;

    @GetMapping("/getAllUser")
    public ResponseEntity<?> doGetAllUser(){
        Map<String, Object> result = new HashMap<>();
        try {
            result.put("success",true);
            result.put("message","Call Api Success");
            result.put("data", userRepo.findAll());
        }catch(Exception e) {
            result.put("success",false);
            result.put("message","Call Api Error");
            result.put("data",null);
            System.out.println(e);
        }
        return ResponseEntity.ok(result);
    }
    @PostMapping ("/postSaveUser")
    public ResponseEntity<?> doPostSaveUser(@RequestBody User user){
        Map<String, Object> result = new HashMap<>();
        try {
            result.put("success",true);
            result.put("message","Call Api Success");
            result.put("data", userService.doSaveUser(user));
        }catch(Exception e) {
            result.put("success",false);
            result.put("message","Call Api Error");
            result.put("data",null);
            System.out.println(e);
        }
        return ResponseEntity.ok(result);
    }
}
