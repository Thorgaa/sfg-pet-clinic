package guru.springframework.stgpetclinic.bootstrap;

import guru.springframework.stgpetclinic.model.Owner;
import guru.springframework.stgpetclinic.model.Vet;
import guru.springframework.stgpetclinic.services.OwnerService;
import guru.springframework.stgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner onwer1 = new Owner();
        onwer1.setId(1L);
        onwer1.setFirstName("Michael");
        onwer1.setLastName("Weston");

        ownerService.save(onwer1);

        Owner onwer2 = new Owner();
        onwer2.setId(2L);
        onwer2.setFirstName("Fiona");
        onwer2.setLastName("Glenanne");

        System.out.println("Loaded owners");

        ownerService.save(onwer2);

        Vet vet1 = new Vet();
        vet1.setId(3L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(4L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Pinkman");

        vetService.save(vet2);

        System.out.println("Loaded vets");
    }
}
