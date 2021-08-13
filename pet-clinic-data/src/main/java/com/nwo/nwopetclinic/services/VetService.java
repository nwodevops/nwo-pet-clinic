package com.nwo.nwopetclinic.services;

import java.util.Set;

import com.nwo.nwopetclinic.model.Vet;

public interface VetService {
  
  Vet findById(Long id);
  Vet seave(Vet owner);
  Set <Vet> findAll();
  
}
