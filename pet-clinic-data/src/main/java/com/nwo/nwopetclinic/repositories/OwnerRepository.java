package com.nwo.nwopetclinic.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.nwo.nwopetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
  Owner findByLastName(String lastName);

  List<Owner> findAllByLastNameLike(String lastName);
}
