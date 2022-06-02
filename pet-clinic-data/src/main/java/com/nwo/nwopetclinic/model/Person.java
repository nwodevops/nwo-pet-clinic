package com.nwo.nwopetclinic.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Person extends BaseEntity {

    private String firstName;
    private String lastName;


}
