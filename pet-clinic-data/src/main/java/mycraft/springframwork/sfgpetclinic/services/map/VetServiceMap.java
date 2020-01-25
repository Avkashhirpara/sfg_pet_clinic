package mycraft.springframwork.sfgpetclinic.services.map;

import mycraft.springframwork.sfgpetclinic.model.Speciality;
import mycraft.springframwork.sfgpetclinic.model.Vet;
import mycraft.springframwork.sfgpetclinic.services.SpecialtiesService;
import mycraft.springframwork.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements
        VetService {

    private SpecialtiesService specialtiesService;

    public VetServiceMap(SpecialtiesService specialtiesService) {
        this.specialtiesService = specialtiesService;
    }

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
        if(object.getSpecialities().size() >0 ){
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId()==null){
                    Speciality savedSpeciality = specialtiesService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }
        return super.save(object);
    }


    public void deletebyId(Long aLong) {
        super.deleteById(aLong);
    }
}
