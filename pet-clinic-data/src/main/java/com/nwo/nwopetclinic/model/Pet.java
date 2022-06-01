package com.nwo.nwopetclinic.model;

import lombok.Data;

import java.time.LocalDate;


public class Pet extends BaseEntity{

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
}
