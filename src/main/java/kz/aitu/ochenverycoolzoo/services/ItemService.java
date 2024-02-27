package kz.aitu.ochenverycoolzoo.services;

import kz.aitu.ochenverycoolzoo.models.Item;
import kz.aitu.ochenverycoolzoo.repositories.ItemRepositoryInterface;
import kz.aitu.ochenverycoolzoo.services.interfaces.ItemServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService implements ItemServiceInterface {
    private final ItemRepositoryInterface repo;

    public ItemService(ItemRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<Item> getAll() {
        return repo.findAll();
    }

    @Override
    public Item getById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Item create(Item item) {
        return repo.save(item);
    }
}
