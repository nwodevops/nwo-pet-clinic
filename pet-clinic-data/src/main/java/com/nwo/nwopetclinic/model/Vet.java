package com.nwo.nwopetclinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "vets")
@Data
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialties", 
        joinColumns = @JoinColumn(name="vet_id"), 
        inverseJoinColumns = @JoinColumn(name="speciality_id"))
        
    private Set<Speciality> specialities = new HashSet<>();
    
}
