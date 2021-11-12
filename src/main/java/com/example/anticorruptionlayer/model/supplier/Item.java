package com.example.anticorruptionlayer.model.supplier;

import lombok.Data;

@Data
public class Item {
    private String type;
    private String model;
    private String internalId;
    private Integer quantity;
}
