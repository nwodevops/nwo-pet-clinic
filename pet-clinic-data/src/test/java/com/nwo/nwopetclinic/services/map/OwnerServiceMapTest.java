package com.nwo.nwopetclinic.services.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Set;

import javax.persistence.Id;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.nwo.nwopetclinic.model.Owner;
import com.nwo.nwopetclinic.services.PetTypeService;

public class OwnerServiceMapTest {

  OwnerServiceMap oServiceMap;
  final Long ownerId = 1l;
  final String lastName = "Smith";

  @BeforeEach
  void setUp() {
    oServiceMap = new OwnerServiceMap(new PetTypeMap(), new PetServiceMap());
    oServiceMap.save(Owner.builder().id(ownerId).lastName(lastName).build());
  }

  @Test
  void testFindAll() {
    Set<Owner> owners = oServiceMap.findAll();
    assertEquals(1, owners.size());
  }

  @Test
  void testFindById() {
    Owner owner = oServiceMap.findById(ownerId);
    assertEquals(ownerId, owner.getId());
  }

  @Test
  void testSaveExistingId() {
    Long id = 2l;
    Owner owner2 = Owner.builder().id(2l).build();
    Owner savedOwner = oServiceMap.save(owner2);
    assertEquals(id, savedOwner.getId());
  }

  @Test
  void testSaveNoId() {

    Owner savedOwner = oServiceMap.save(Owner.builder().build());

    assertNotNull(savedOwner);
    assertNotNull(savedOwner.getId());

  }

  @Test
  void testDelete() {
    oServiceMap.delete(oServiceMap.findById(ownerId));

    assertEquals(0, oServiceMap.findAll().size());
  }

  @Test
  void findByLastNameNotFound() {
    Owner smith = oServiceMap.findByLastName("foo");

    assertNull(smith);
  }

  @Test
  void testDeleteById() {
    oServiceMap.deleteById(ownerId);

    assertEquals(0, oServiceMap.findAll().size());
  }

  @Test
  void testFindByLastName() {
    Owner smith = oServiceMap.findByLastName(lastName);

    assertNotNull(smith);

    assertEquals(ownerId, smith.getId());
  }

}
