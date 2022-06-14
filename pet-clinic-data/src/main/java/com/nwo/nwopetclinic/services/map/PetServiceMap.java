package com.nwo.nwopetclinic.services.map;

import java.util.Set;

import com.nwo.nwopetclinic.model.Pet;
import com.nwo.nwopetclinic.services.CrudService;
import com.nwo.nwopetclinic.services.PetService;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class PetServiceMap 
  extends AbstractMapService<Pet, Long> implements PetService  {

  @Override
  public void delete(Pet object) {
    super.delete(object);
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public Set<Pet> findAll() {
    return super.findAll();
  }

  @Override
  public Pet findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Pet save(Pet object) {
    return super.save(object);
  }

}
