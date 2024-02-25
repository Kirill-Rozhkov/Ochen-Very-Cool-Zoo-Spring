package kz.aitu.ochenverycoolzoo.services;

import kz.aitu.ochenverycoolzoo.models.Item;
import kz.aitu.ochenverycoolzoo.services.interfaces.ItemServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService implements ItemServiceInterface {

    @Override
    public List<Item> getAll() {
        return null;
    }

    @Override
    public Item getById(int id) {
        return null;
    }
}
