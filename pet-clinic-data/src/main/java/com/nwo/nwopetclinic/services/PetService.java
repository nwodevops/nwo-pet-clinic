package com.nwo.nwopetclinic.services;

import java.util.Set;

import com.nwo.nwopetclinic.model.Pet;

public interface PetService {

  Pet findById(Long id);
  Pet seave(Pet owner);
  Set <Pet> findAll();
  
}
