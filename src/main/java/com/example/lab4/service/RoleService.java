package com.example.lab4.service;

import com.example.lab4.Entity.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRole();
    Role doSaveRole(Role role);
    List<Role> getByRoleName(String roleName);
    void  doGetDelete(int id);
}
