package com.nwo.nwopetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.nwo.nwopetclinic.model.PetType;
import com.nwo.nwopetclinic.repositories.PetTypeRepository;
import com.nwo.nwopetclinic.services.PetTypeService;

@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {
  private final PetTypeRepository pTypeRepository;

  public PetTypeSDJpaService(PetTypeRepository pTypeRepository) {
    this.pTypeRepository = pTypeRepository;
  }

  @Override
  public void delete(PetType object) {
    pTypeRepository.delete(object);
  }

  @Override
  public void deleteById(Long id) {
    pTypeRepository.deleteById(id);
  }

  @Override
  public Set<PetType> findAll() {
    Set<PetType> petTypes = new HashSet<>();
    pTypeRepository.findAll().forEach(petTypes::add);
    return petTypes;
  }

  @Override
  public PetType findById(Long id) {
    return pTypeRepository.findById(id).orElse(null);
  }

  @Override
  public PetType save(PetType object) {
    return pTypeRepository.save(object);
  }

  
}
