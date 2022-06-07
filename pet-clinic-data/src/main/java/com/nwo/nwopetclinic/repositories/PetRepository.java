package com.nwo.nwopetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nwo.nwopetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long>{
  
}
