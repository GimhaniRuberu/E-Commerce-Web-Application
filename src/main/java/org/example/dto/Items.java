package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Items {
    private String id;
    private Double price;
    private String category;
    private int qty;
    private String size;
    private String discription; //is available
    private String image;
}
