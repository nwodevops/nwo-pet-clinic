package com.nwo.nwopetclinic.controllers;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.hamcrest.Matchers.*;
import com.nwo.nwopetclinic.model.Owner;
import com.nwo.nwopetclinic.services.OwnerService;

@ExtendWith(MockitoExtension.class)
public class OwnerControllerTest {

  @Mock
  OwnerService oService;
  @InjectMocks
  OwnerController controller;

  Set<Owner> owners;

  MockMvc mockMvc;
  
  @BeforeEach
  void setUp() {
    
    owners = new HashSet<>();
      owners.add(Owner.builder().id(1l).build());
      owners.add(Owner.builder().id(2l).build());

      mockMvc = MockMvcBuilders
        .standaloneSetup(controller)
        .build();
  }

  @Test
  void testListOwner() throws Exception {
    when(oService.findAll()).thenReturn(owners);

    mockMvc.perform(get("/owners")).andExpect(status().is(200))
      .andExpect(view().name("owners/index"))
      .andExpect(model().attribute("owners", hasSize(2)));
  }

  @Test
    void displayOwner() throws Exception {
        when(oService.findById(anyLong())).thenReturn(Owner.builder().id(1l).build());

        mockMvc.perform(get("/owners/123"))
                .andExpect(status().isOk())
                .andExpect(view().name("owners/ownerDetails"))
                .andExpect(model().attribute("owner", hasProperty("id", is(1l))));
    }

}
