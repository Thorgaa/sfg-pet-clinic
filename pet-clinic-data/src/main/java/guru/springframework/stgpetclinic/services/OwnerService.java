package guru.springframework.stgpetclinic.services;

import guru.springframework.stgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName (String lastName);
}
