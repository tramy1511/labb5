package com.example.lab4.reponsitory;

import com.example.lab4.Entity.Role;
import com.example.lab4.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role,Integer> {
    @Query("select u from Role u where u.roleName like?1")
    public List<Role> findByRoleName(String userName);
}
