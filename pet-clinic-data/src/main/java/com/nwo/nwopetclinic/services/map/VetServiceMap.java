package com.nwo.nwopetclinic.services.map;

import java.util.Set;

import com.nwo.nwopetclinic.model.Speciality;
import com.nwo.nwopetclinic.model.Vet;
import com.nwo.nwopetclinic.services.CrudService;
import com.nwo.nwopetclinic.services.SpecialtyService;
import com.nwo.nwopetclinic.services.VetService;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Service
@Profile({"default", "map"})
public class VetServiceMap
  extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;
    

    public VetServiceMap(SpecialtyService specialtyService) {
      this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {  
      return super.findAll();
    }
  
    @Override
    public Vet findById(Long id) {
      return super.findById(id);
    }
  
    @Override
    public Vet save(Vet object) {

      if(object.getSpecialities().size() > 0){
        object.getSpecialities().forEach(item -> {
          if(item.getId() == null){
            Speciality savedSpecialty = specialtyService.save(item);
            item.setId(savedSpecialty.getId());
          }
        });
      }

      return super.save(object);
    }
  
    @Override
    public void delete(Vet object) {  
      super.delete(object);
    }
  
    @Override
    public void deleteById(Long id) {
      super.deleteById(id);
    }
    
  
}
