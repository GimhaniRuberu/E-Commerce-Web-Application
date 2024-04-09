package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ItemsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private Double price;
    private String category;
    private int qty;
    private String size;
    private String discription; //is available
    private String image;

}
