package guru.springframework.stgpetclinic.services;

import guru.springframework.stgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findByLastName (String lastName);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
