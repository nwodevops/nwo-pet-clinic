package com.nwo.nwopetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.nwo.nwopetclinic.model.Pet;
import com.nwo.nwopetclinic.repositories.PetRepository;
import com.nwo.nwopetclinic.services.PetService;

@Service
@Profile("springdatajpa")
public class PetSDJpaService implements PetService  {
  private final PetRepository pRepository;

  public PetSDJpaService(PetRepository pRepository) {
    this.pRepository = pRepository;
  }

  @Override
  public Set<Pet> findAll() {
    Set<Pet> pets = new HashSet<>();
    pRepository.findAll().forEach(pets::add);
    return pets;
  }

  @Override
  public Pet findById(Long id) {
    return pRepository.findById(id).orElse(null);
  }

  @Override
  public Pet save(Pet owner) {
    return pRepository.save(owner);
  }

  @Override
  public void delete(Pet object) {
    pRepository.delete(object);
  }

  @Override
  public void deleteById(Long id) {
    pRepository.deleteById(id);
  }

  
  
}
