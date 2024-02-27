package kz.aitu.ochenverycoolzoo.repositories;

import kz.aitu.ochenverycoolzoo.models.Action;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActionRepositoryInterface extends JpaRepository<Action, Integer> {
}
