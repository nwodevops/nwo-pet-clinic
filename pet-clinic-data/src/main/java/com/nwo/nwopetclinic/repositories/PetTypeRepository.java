package com.nwo.nwopetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nwo.nwopetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
  
}
