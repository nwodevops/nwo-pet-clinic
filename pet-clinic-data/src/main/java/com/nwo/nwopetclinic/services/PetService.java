package com.nwo.nwopetclinic.services;

import java.util.Set;

import com.nwo.nwopetclinic.model.Pet;

public interface PetService extends CrudService<Pet, Long> {

  Pet findById(Long id);
  Pet save(Pet owner);
  Set <Pet> findAll();
  
}
