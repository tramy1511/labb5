package com.example.lab4.Entity;


import org.springframework.stereotype.Component;


@Component//@Autowide`
public class SchoolInformation {
   private String fullname="FPT-BEAN";
    private String location="TP.HCM";

    public String getFullname() {
        return fullname;
    }

    public SchoolInformation() {
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
