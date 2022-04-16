package com.mainapp.mo2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    private PetTyep petTyep;
    private Owner owner;
    private LocalDate birthDay;

}
