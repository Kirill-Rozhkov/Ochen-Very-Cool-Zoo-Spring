package kz.aitu.ochenverycoolzoo.repositories;

import kz.aitu.ochenverycoolzoo.models.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepositoryInterface extends JpaRepository<Animal, Integer> {
}
