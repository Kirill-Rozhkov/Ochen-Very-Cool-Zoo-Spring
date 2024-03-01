package kz.aitu.ochenverycoolzoo.controllers;

import kz.aitu.ochenverycoolzoo.models.Animal;

public class ZooController {
    private  zoo;

    public ZooController(Zoo zoo) {
        this.zoo = zoo;
    }

    public void sortByAge() {
        Collections.sort(zoo.getAnimals(), (a1, a2) -> Integer.compare(a1.getAge(), a2.getAge()));
    }

    public void printAnimals() {
        for (Animal animal : zoo.getAnimals()) {
            System.out.println(animal);
        }
    }
}