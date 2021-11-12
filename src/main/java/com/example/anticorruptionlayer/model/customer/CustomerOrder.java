package com.example.anticorruptionlayer.model.customer;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
public class CustomerOrder {
    @JsonUnwrapped
    private ServiceStation serviceStation;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private Date orderDate;
    private Map<String, List<SparePart>> sparePartsOrder;
}
