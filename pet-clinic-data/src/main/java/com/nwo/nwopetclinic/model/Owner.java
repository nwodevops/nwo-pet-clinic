package com.nwo.nwopetclinic.model;

import java.util.Set;

import lombok.Data;


@public class Owner extends  Person{
    private Set<Pet> pets;
}
