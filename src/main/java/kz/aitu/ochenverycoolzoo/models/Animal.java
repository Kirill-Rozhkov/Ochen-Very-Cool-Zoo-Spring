package kz.aitu.ochenverycoolzoo.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;

@Data
@Entity
@Table(name = "animals")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private String type;
    private String location;
    @ElementCollection
    @Column(name = "actions", columnDefinition = "jsonb")
    private ArrayList<Action> actions;


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                ", actions=" + actions.toString() +
                '}';
    }
}
