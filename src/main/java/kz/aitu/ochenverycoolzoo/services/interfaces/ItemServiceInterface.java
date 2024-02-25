package kz.aitu.ochenverycoolzoo.services.interfaces;

import kz.aitu.ochenverycoolzoo.models.Item;

import java.util.List;

public interface ItemServiceInterface {
    List<Item> getAll();
    Item getById(int id);
}
