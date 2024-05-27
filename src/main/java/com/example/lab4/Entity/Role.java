package com.example.lab4.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Role")
public class Role {
    @Id
    @Column(name="role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  roleId;
    @Column(name="role_name")
    private String roleName;
    @Column(name="description")
    private String description;
}
