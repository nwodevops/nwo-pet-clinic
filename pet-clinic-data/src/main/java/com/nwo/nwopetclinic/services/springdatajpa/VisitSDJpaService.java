package com.nwo.nwopetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.nwo.nwopetclinic.model.Visit;
import com.nwo.nwopetclinic.repositories.VisitRepository;
import com.nwo.nwopetclinic.services.VisitService;

@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService {

  private final VisitRepository vRepository;
  

  public VisitSDJpaService(VisitRepository vRepository) {
    this.vRepository = vRepository;
  }

  @Override
  public void delete(Visit object) {
    vRepository.delete(object);
  }

  @Override
  public void deleteById(Long id) {
    vRepository.deleteById(id);
  }

  @Override
  public Set<Visit> findAll() {
    Set<Visit> visits = new HashSet<>();
    vRepository.findAll().forEach(visits::add);
    return visits;
  }

  @Override
  public Visit findById(Long id) {
    return vRepository.findById(id).orElse(null);
  }

  @Override
  public Visit save(Visit object) {
    return vRepository.save(object);
  }
  
}
