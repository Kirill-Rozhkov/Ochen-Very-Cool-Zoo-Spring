package kz.aitu.ochenverycoolzoo.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "items")
@Embeddable
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int price;

}
