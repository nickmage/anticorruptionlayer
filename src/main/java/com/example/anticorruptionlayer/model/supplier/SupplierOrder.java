package com.example.anticorruptionlayer.model.supplier;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class SupplierOrder {
    private String service;
    private String customerId;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private Date orderAcceptanceDate;
    private String orderType;
    private List<Item> order;
}
