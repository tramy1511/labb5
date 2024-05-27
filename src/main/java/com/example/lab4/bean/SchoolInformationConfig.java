package com.example.lab4.bean;

import com.example.lab4.Entity.SchoolInformation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//Qualifier
public class SchoolInformationConfig {
    @Bean("SchoolInformationConfig")//QUalifier
    public SchoolInformation schoolInformationConfig(){
        SchoolInformation schoolInformation= new SchoolInformation();
        schoolInformation.setFullname("FPT_CONFIG");
        schoolInformation.setLocation("TPHCM");
        return schoolInformation;
    }
}
