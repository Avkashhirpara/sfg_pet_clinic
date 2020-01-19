package mycraft.springframwork.sfgpetclinic.services.map;

import mycraft.springframwork.sfgpetclinic.model.Vet;
import mycraft.springframwork.sfgpetclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements
        CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet findbyId(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deletebyId(Long aLong) {
        super.deleteById(aLong);
    }
}
