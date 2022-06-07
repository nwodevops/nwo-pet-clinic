package com.nwo.nwopetclinic.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Setter @Getter
public class BaseEntity implements Serializable{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  
}
