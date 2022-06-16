package com.nwo.nwopetclinic.controllers;

import com.nwo.nwopetclinic.model.Vet;
import com.nwo.nwopetclinic.services.VetService;

import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VetController {

  private final VetService vetService;

  public VetController(VetService vetService) {
      this.vetService = vetService;
  }

  @RequestMapping({"/vets", "/vets/index", "/vets/index.html", "/vets.html"})
  public String listVets(Model model){

      model.addAttribute("vets", vetService.findAll());

      return "vets/index";
  }

  @GetMapping("/api/vets")
  public @ResponseBody Set<Vet> getVetsJson(){

      return vetService.findAll();
  }
  
}
