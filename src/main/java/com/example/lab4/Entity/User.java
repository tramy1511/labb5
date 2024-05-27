package com.example.lab4.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="[User]")
@Entity
public class User {
    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name="user_name")
    private String userName;

    @Column(name="pass_word")
    private String passWord;

    @Column(name="full_name")
    private String fullName;

    @Column(name="address")
    private String address;

    @Column(name="age")
    private int age;

    @Column(name="diem")
    private Double diem;

    @Column(name="hoc_luc")
    private String hocLuc;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="role_id", referencedColumnName = "role_id")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private Role role;

}
