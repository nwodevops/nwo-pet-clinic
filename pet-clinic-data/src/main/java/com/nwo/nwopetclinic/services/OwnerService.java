package com.nwo.nwopetclinic.services;

import java.util.List;
import java.util.Set;

import com.nwo.nwopetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
