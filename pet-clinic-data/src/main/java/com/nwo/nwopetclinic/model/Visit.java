package com.nwo.nwopetclinic.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Visit  extends BaseEntity{
 
    private LocalDate date;
    private String description;
    private Pet pet;
}
