package mycraft.springframwork.sfgpetclinic.services.map;

import mycraft.springframwork.sfgpetclinic.model.Vet;
import mycraft.springframwork.sfgpetclinic.services.CrudService;
import mycraft.springframwork.sfgpetclinic.services.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements
        VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }


    public Vet findbyId(Long aLong) {
        return super.findById(aLong);
    }


    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }


    public void deletebyId(Long aLong) {
        super.deleteById(aLong);
    }
}
