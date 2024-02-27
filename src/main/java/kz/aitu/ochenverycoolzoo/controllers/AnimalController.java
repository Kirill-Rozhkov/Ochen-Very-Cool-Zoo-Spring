package kz.aitu.ochenverycoolzoo.controllers;

import kz.aitu.ochenverycoolzoo.models.Animal;
import kz.aitu.ochenverycoolzoo.services.interfaces.AnimalServiceInterface;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("animals")
public class AnimalController {

    private final AnimalServiceInterface service;

    public AnimalController(AnimalServiceInterface service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<Animal> getAll() {
        return service.getAll();
    }

    @GetMapping("/{animal_id}")
    public ResponseEntity<Animal> getById(@PathVariable("animal_id") int id) {
        Animal animal = service.getById(id);
        if (animal == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 404

        return new ResponseEntity(animal, HttpStatus.OK); // 200
    }

    @GetMapping("/location/{animal_location}")
    public List<Animal> getAllByLocation(@PathVariable("animal_location") String location) {
        return service.getByLocation(location);
    }

    @PostMapping("/")
    public ResponseEntity<Animal> create(@RequestBody Animal animal){
        Animal createdAnimal = service.create(animal);
        if(createdAnimal == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(createdAnimal, HttpStatus.CREATED);
    }
}
