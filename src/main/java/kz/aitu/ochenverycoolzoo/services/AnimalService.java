package kz.aitu.ochenverycoolzoo.services;

import kz.aitu.ochenverycoolzoo.models.Animal;
import kz.aitu.ochenverycoolzoo.repositories.AnimalRepositoryInterface;
import kz.aitu.ochenverycoolzoo.repositories.ItemRepositoryInterface;
import kz.aitu.ochenverycoolzoo.services.interfaces.AnimalServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService implements AnimalServiceInterface {

    private final AnimalRepositoryInterface animalRepo;

    public AnimalService(AnimalRepositoryInterface repo, ItemRepositoryInterface itemRepo) {
        this.animalRepo = repo;
    }

    @Override
    public List<Animal> getAll() {
        return null;
    }

    @Override
    public List<Animal> getByLocation(String location) {
        return null;
    }

    @Override
    public Animal getById(int id) {
        return null;
    }
}
