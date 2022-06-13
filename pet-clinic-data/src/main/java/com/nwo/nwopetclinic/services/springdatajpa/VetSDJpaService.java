package com.nwo.nwopetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.nwo.nwopetclinic.model.Vet;
import com.nwo.nwopetclinic.repositories.VetRepository;
import com.nwo.nwopetclinic.services.VetService;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {
  private final VetRepository vRepository;
  

  public VetSDJpaService(VetRepository vRepository) {
    this.vRepository = vRepository;
  }

  @Override
  public void delete(Vet object) {
    vRepository.delete(object);
  }

  @Override
  public void deleteById(Long id) {
    vRepository.deleteById(id);
  }

  @Override
  public Set<Vet> findAll() {
    Set<Vet> vets = new HashSet<>();
    vRepository.findAll().forEach(vets::add); 
    return vets;

  }

  @Override
  public Vet findById(Long id) {
    return vRepository.findById(id).orElse(null);
  }

  @Override
  public Vet save(Vet object) {
    return vRepository.save(object);
  }
  
}
