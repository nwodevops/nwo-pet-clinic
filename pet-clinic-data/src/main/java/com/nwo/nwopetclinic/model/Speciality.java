package com.nwo.nwopetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "specialties")
@Data
public class Speciality extends BaseEntity {

    @Column(name = "description")
    private String description;
}
