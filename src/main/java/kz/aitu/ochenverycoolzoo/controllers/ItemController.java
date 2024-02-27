package kz.aitu.ochenverycoolzoo.controllers;

import kz.aitu.ochenverycoolzoo.models.Item;
import kz.aitu.ochenverycoolzoo.services.interfaces.ItemServiceInterface;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("items")
public class ItemController {

    private final ItemServiceInterface service;

    public ItemController(ItemServiceInterface service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<Item> getAll() {
        return service.getAll();
    }

    @GetMapping("/{item_id}")
    public ResponseEntity<Item> getById(@PathVariable("item_id") int id) {
        Item item = service.getById(id);
        if (item == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 404

        return new ResponseEntity(item, HttpStatus.OK); // 200
    }

    @PostMapping("/")
    public ResponseEntity<Item> create(@RequestBody Item item){
        Item createdItem = service.create(item);
        if(createdItem == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(createdItem, HttpStatus.CREATED);
    }
}