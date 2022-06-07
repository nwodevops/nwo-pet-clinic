package com.nwo.nwopetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nwo.nwopetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
  
}
