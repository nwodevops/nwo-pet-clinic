package com.nwo.nwopetclinic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.nwo.nwopetclinic.model.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
  Owner findByLastName(String lastName);
}
