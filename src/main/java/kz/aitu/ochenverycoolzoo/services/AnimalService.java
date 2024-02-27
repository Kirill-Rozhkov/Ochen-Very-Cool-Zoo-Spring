package kz.aitu.ochenverycoolzoo.services;
import kz.aitu.ochenverycoolzoo.models.Animal;
import kz.aitu.ochenverycoolzoo.repositories.AnimalRepositoryInterface;
import kz.aitu.ochenverycoolzoo.services.interfaces.AnimalServiceInterface;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService implements AnimalServiceInterface {

    private final AnimalRepositoryInterface repo;

    public AnimalService(AnimalRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<Animal> getAll() {
        return repo.findAll();
    }

    @Override
    public List<Animal> getByLocation(String location) {
        return repo.findByLocation(location);
    }

    @Override
    public Animal getById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Animal create(Animal animal) {
        return repo.save(animal);
    }
}
