package com.nwo.nwopetclinic.model;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;

@Data
public class Vet extends Person {

    private Set<Speciality> specialities = new HashSet<>();
    
}
