package com.nwo.nwopetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.nwo.nwopetclinic.*")
public class NwoPetClinicApplication {

    public static void main(String[] args) {
        SpringApplication.run(NwoPetClinicApplication.class, args);
    }

}
