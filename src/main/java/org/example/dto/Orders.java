package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    private String id;
    private Double totalFee;
    private String date;
    private int qty;
    private String paymentDetail;   //paid or not
    private String discription;
}
