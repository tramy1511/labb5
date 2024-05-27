package com.example.lab4.API;

import com.example.lab4.Entity.SchoolInformation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/java5_b4/bean")

public class beanApi {
    @Autowired
    @Qualifier("SchoolInformationConfig")
    SchoolInformation schoolInformation;
    @GetMapping("/getSchoolInformation")
    public ResponseEntity<?> doGetSchoolInformation(){
        //SchoolInformation schoolInformation= new SchoolInformation();
        //schoolInformation.setFullname("FPT");
        //schoolInformation.setLocation("TP.HCM");

        return ResponseEntity.ok(schoolInformation);
    }

}
