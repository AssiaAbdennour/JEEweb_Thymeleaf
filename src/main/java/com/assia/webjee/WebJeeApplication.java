package com.assia.webjee;

import com.assia.webjee.Repositories.PatientRepository;
import com.assia.webjee.Entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class WebJeeApplication {

    public static void main(String[] args) {

        SpringApplication.run(WebJeeApplication.class, args);
    }
    //@Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient(null,"Assia",new Date(),false,156));
            patientRepository.save(new Patient(null,"Imane",new Date(),false,110));
            patientRepository.save(new Patient(null,"Salma",new Date(),false,210));
            patientRepository.save(new Patient(null,"Hicham",new Date(),false,230));
            patientRepository.save(new Patient(null,"Asmaa",new Date(),false,120));
            patientRepository.save(new Patient(null,"Hamza",new Date(),false,210));

            patientRepository.findAll().forEach(patient -> {
                System.out.println(patient.getNom());
            });
        };

    }





}
