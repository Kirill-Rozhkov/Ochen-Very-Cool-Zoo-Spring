package kz.aitu.ochenverycoolzoo.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Embeddable
public class Action {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String request;
    private String response;

    @Override
    public String toString() {
        return request;
    }
}
