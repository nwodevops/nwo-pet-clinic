package com.nwo.nwopetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nwo.nwopetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
  
}
