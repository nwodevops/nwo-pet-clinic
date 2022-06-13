package com.nwo.nwopetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import com.nwo.nwopetclinic.model.Speciality;
import com.nwo.nwopetclinic.repositories.SpecialtyRepository;
import com.nwo.nwopetclinic.services.SpecialtyService;

public class SpecialtySDJpaService implements SpecialtyService {

  private final SpecialtyRepository sRepository;

  public SpecialtySDJpaService(SpecialtyRepository sRepository) {
    this.sRepository = sRepository;
  }

  @Override
  public void delete(Speciality object) {
    sRepository.delete(object);
  }

  @Override
  public void deleteById(Long id) {
    sRepository.deleteById(id);
  }

  @Override
  public Set<Speciality> findAll() {
    Set<Speciality> specialities = new HashSet<>();
    sRepository.findAll().forEach(specialities::add);
    return specialities;
  }

  @Override
  public Speciality findById(Long id) {
    return sRepository.findById(id).orElse(null);
  }

  @Override
  public Speciality save(Speciality object) {
    return sRepository.save(object);
  }
  
}
