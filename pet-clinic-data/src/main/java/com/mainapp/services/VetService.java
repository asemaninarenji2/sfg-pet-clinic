package com.mainapp.services;

import com.mainapp.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findByLastname(String lastName);
    Vet findByid(Long id);
    Vet save (Vet vet);
    Set<Vet> findAll();
}
