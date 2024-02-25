package kz.aitu.ochenverycoolzoo.controllers;

import kz.aitu.ochenverycoolzoo.services.interfaces.ItemServiceInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("items")
public class ItemController {

    private final ItemServiceInterface service;

    public ItemController(ItemServiceInterface service) {
        this.service = service;
    }


    @GetMapping
    public String sayHello() {
        return "Goodbye World";
    }
}