package com.example.lab4.service.impl;

import com.example.lab4.Entity.Role;
import com.example.lab4.reponsitory.RoleRepository;
import com.example.lab4.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
 public class RoleServiceImp implements RoleService {
 @Autowired
    private RoleRepository roleRepository;
    @Override
    public List<Role> getAllRole() {
        return roleRepository.findAll() ;
    }

    @Override
    public Role doSaveRole(Role role) {
        return roleRepository.saveAndFlush(role);
    }

    @Override
    public List<Role> getByRoleName(String roleName) {
        return roleRepository.findByRoleName(roleName);
    }

    @Override
    public void doGetDelete(int id) {
        roleRepository.deleteById(id);
    }
}
