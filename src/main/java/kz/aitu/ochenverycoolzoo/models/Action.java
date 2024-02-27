package kz.aitu.ochenverycoolzoo.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "actions")
public class Action {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String request;
    private String response;
    private String important_item;

    @Override
    public String toString() {
        return request;
    }
}
