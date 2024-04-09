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
public class OrdersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private Double totalFee;
    private String date;
    private int qty;
    private String paymentDetail;   //paid or not
    private String discription;
}
