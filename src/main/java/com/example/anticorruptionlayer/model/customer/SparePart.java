package com.example.anticorruptionlayer.model.customer;

import lombok.Data;

@Data
public class SparePart {
    private String manufacturer;
    private String model;
    private String vendorCode;
    private Integer quantity;
}
