package com.nwo.nwopetclinic.services;

import java.util.Set;

import com.nwo.nwopetclinic.model.Owner;

public interface ownerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
