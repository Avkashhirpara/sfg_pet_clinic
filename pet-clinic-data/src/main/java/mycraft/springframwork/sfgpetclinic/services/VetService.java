package mycraft.springframwork.sfgpetclinic.services;

import mycraft.springframwork.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();

}