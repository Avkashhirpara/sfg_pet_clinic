package mycraft.springframwork.sfgpetclinic.services.map;

import mycraft.springframwork.sfgpetclinic.model.Speciality;
import mycraft.springframwork.sfgpetclinic.services.SpecialtiesService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class SpecialityMapService extends AbstractMapService <Speciality,Long> implements SpecialtiesService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findbyId(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deletebyId(Long aLong) {
        super.deleteById(aLong);
    }
}
