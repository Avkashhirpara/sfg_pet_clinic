package mycraft.springframwork.sfgpetclinic.bootstrap;

import mycraft.springframwork.sfgpetclinic.model.*;
import mycraft.springframwork.sfgpetclinic.services.OwnerService;
import mycraft.springframwork.sfgpetclinic.services.PetTypeService;
import mycraft.springframwork.sfgpetclinic.services.SpecialtiesService;
import mycraft.springframwork.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService   petTypeService;
    private final SpecialtiesService specialtiesService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtiesService specialtiesService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtiesService = specialtiesService;
    }

    @Override
    public void run(String... args) throws Exception {
        loadData();
    }
    private void loadData() {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialtiesService.save(radiology);

        Speciality surgery= new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedsurgery = specialtiesService.save(surgery);

        Speciality dentistry= new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality saveddentistry = specialtiesService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickrel");
        owner1.setCity("Miami");
        owner1.setTelephone("12312312345");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("123 Brickrel");
        owner2.setCity("Miami");
        owner2.setTelephone("12312312345");

        Pet fionaPet = new Pet();
        fionaPet.setPetType(savedCatType);
        fionaPet.setOwner(owner2);
        fionaPet.setBirthDate(LocalDate.now());
        fionaPet.setName("Kitty");
        owner2.getPets().add(fionaPet);
        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialities().add(savedRadiology);


        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vet2.getSpecialities().add(savedsurgery);


        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
