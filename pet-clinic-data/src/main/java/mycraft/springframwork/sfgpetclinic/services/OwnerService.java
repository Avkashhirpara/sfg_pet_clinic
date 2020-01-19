package mycraft.springframwork.sfgpetclinic.services;

import mycraft.springframwork.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
