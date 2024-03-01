package kz.aitu.ochenverycoolzoo.services.interfaces;
import kz.aitu.ochenverycoolzoo.models.Animal;

import java.util.List;

public interface AnimalServiceInterface {
    List<Animal> getAll();
    List<Animal> getByLocation(String location);
    Animal getById(int id);
    Animal create(Animal animal);
}

