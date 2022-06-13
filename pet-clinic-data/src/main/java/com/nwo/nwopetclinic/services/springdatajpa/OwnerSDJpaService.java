package com.nwo.nwopetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.nwo.nwopetclinic.model.Owner;
import com.nwo.nwopetclinic.repositories.OwnerRepository;
import com.nwo.nwopetclinic.repositories.PetRepository;
import com.nwo.nwopetclinic.repositories.PetTypeRepository;
import com.nwo.nwopetclinic.services.OwnerService;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

  private final OwnerRepository oRepository;
  private final PetRepository pRepository;
  private final PetTypeRepository pTypeRepository;

  public OwnerSDJpaService(OwnerRepository oRepository, PetRepository pRepository, PetTypeRepository pTypeRepository) {
    this.oRepository = oRepository;
    this.pRepository = pRepository;
    this.pTypeRepository = pTypeRepository;
  }

  @Override
  public Owner findByLastName(String lastName) {
    return oRepository.findByLastName(lastName);
  }

  @Override
  public void delete(Owner object) {
    oRepository.delete(object);
  }

  @Override
  public void deleteById(Long id) {
    oRepository.deleteById(id);
  }

  @Override
  public Set<Owner> findAll() {
    Set<Owner> owners = new HashSet<>();
    oRepository.findAll().forEach(owners::add);
    return owners;
  }

  @Override
  public Owner findById(Long id) {
    return oRepository.findById(id).orElse(null);
  }

  @Override
  public Owner save(Owner object) {
    return oRepository.save(object);
  }

}
