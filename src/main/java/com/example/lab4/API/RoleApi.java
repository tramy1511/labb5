package com.example.lab4.API;

import com.example.lab4.Entity.Role;
import com.example.lab4.Entity.User;
import com.example.lab4.reponsitory.RoleRepository;
import com.example.lab4.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/role-api")
public class RoleApi {
    @Autowired
    private RoleRepository roleRepo;
    @Autowired
    private RoleService roleService;
    @Autowired
    private RoleRepository roleRepository;

    @GetMapping("/getAllRole")
    public ResponseEntity<?> doGetAllRole() {
        Map<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", "Call Api Success");
        result.put("data", roleService.getAllRole());
        return ResponseEntity.ok(result);

    }

    @PostMapping("/postAllRole")
    public ResponseEntity<?> doPostAllRole(@RequestBody Role role) {
        Map<String, Object> result = new HashMap<>();

        try {
            result.put("success", true);
            result.put("message", "Call Api Success");
            result.put("data", roleService.doSaveRole(role));
        } catch (Exception e) {
            result.put("success", false);
            result.put("message", "Call Api Error");
            result.put("data", null);
            System.out.println(e);
        }
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getFindByRoleName/{roleName}")
        public List<Role> doGetFindByUserName(@PathVariable String roleName){
            return roleService.getByRoleName(roleName);
        }
    @DeleteMapping ("/getDeleteId/{id}")
    public ResponseEntity<?> doPostSaveUser(@PathVariable int id){
        Map<String, Object> result = new HashMap<>();
        try {
            result.put("success",true);
            result.put("message","Call Api Success");
            roleService.doGetDelete(id);
        }catch(Exception e) {
            result.put("success",false);
            result.put("message","Call Api Error");
            result.put("data",null);
            System.out.println(e);
        }
        return ResponseEntity.ok(result);
    }

}
