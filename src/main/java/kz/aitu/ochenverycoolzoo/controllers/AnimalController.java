package kz.aitu.ochenverycoolzoo.controllers;

import kz.aitu.ochenverycoolzoo.models.Animal;
import kz.aitu.ochenverycoolzoo.services.interfaces.AnimalServiceInterface;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
