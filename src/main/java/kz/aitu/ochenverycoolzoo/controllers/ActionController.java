package kz.aitu.ochenverycoolzoo.controllers;

import kz.aitu.ochenverycoolzoo.models.Action;
import kz.aitu.ochenverycoolzoo.models.Item;
import kz.aitu.ochenverycoolzoo.services.interfaces.ActionServiceInterface;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("actions")
public class ActionController {

    private final ActionServiceInterface service;

    public ActionController(ActionServiceInterface service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<Action> getAll() {
        return service.getAll();
    }

    @GetMapping("/{action_id}")
    public ResponseEntity<Item> getById(@PathVariable("action_id") int id) {
        Action action = service.getById(id);
        if (action == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 404

        return new ResponseEntity(action, HttpStatus.OK); // 200
    }

    @PostMapping("/")
    public ResponseEntity<Action> create(@RequestBody Action action){
        Action createdAction = service.create(action);
        if(createdAction == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(createdAction, HttpStatus.CREATED);
    }
}
