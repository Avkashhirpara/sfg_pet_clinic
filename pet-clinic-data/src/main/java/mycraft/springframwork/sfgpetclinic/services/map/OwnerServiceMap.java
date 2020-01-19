package mycraft.springframwork.sfgpetclinic.services.map;

import mycraft.springframwork.sfgpetclinic.model.Owner;
import mycraft.springframwork.sfgpetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements
        CrudService<Owner,Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }
    @Override
    public void delete(Owner object) {
    super.delete(object);
    }
    @Override
    public Owner findbyId(Long aLong) {
        return super.findById(aLong);
    }
    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }
    @Override
    public void deletebyId(Long aLong) {
        super.deleteById(aLong);
    }
}
