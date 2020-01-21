package mycraft.springframwork.sfgpetclinic.services.map;

import mycraft.springframwork.sfgpetclinic.model.Owner;
import mycraft.springframwork.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements
        OwnerService {

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
        return super.save(object);
    }
    @Override
    public void deletebyId(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
