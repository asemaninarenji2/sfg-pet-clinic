package com.mainapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
public class Pet extends BaseEntity{
    private PetTyep petTyep;
    private Owner owner;
    private LocalDate birthDay;

}
