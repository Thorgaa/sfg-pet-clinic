package guru.springframework.stgpetclinic.services;

import guru.springframework.stgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findByLastName (String lastName);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
