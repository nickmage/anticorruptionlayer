package com.example.anticorruptionlayer.controller;

import com.example.anticorruptionlayer.model.customer.CustomerOrder;
import com.example.anticorruptionlayer.model.supplier.SupplierOrder;
import com.example.anticorruptionlayer.service.TransferService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AnticorruptionController {

    private final TransferService service;

    @PostMapping("/order")
    public SupplierOrder test(@RequestBody CustomerOrder customerOrder){
        return service.toSupplierOrder(customerOrder);
    }
}
