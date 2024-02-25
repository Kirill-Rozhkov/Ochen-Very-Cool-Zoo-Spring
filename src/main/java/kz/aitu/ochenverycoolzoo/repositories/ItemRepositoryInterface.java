package kz.aitu.ochenverycoolzoo.repositories;

import kz.aitu.ochenverycoolzoo.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepositoryInterface extends JpaRepository<Item, Integer> {
}
