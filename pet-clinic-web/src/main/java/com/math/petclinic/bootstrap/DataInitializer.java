package com.math.petclinic.bootstrap;

import com.math.petclinic.model.Owner;
import com.math.petclinic.model.Vet;
import com.math.petclinic.services.OwnerService;
import com.math.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataInitializer(OwnerService ownerService, VetService vetService){
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args)  {

        Owner owner1 = new Owner();
        owner1.setFirstName("Matheesh");
        owner1.setLastName("Prabhu");
        owner1.setId(107L);

        Owner owner2 = new Owner();
        owner2.setFirstName("Soorya");
        owner2.setLastName("ks");
        owner2.setId(113L);

        ownerService.save(owner1);
        ownerService.save(owner2);

        System.out.println("Saved owners");

        Vet vet1 = new Vet();
        vet1.setFirstName("Naruto");
        vet1.setLastName("Uzumaki");
        vet1.setId(111L);

        Vet vet2 = new Vet();
        vet2.setFirstName("Sasuke");
        vet2.setLastName("Uchiha");
        vet2.setId(135L);

        vetService.save(vet1);
        vetService.save(vet2);

        System.out.println("Saved vets");
    }
}
