package kz.aitu.ochenverycoolzoo.repositories;

import kz.aitu.ochenverycoolzoo.models.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnimalRepositoryInterface extends JpaRepository<Animal, Integer> {
    List<Animal> findByLocation(String location);
}
