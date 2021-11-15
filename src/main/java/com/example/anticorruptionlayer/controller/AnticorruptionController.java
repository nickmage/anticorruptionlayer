package com.example.anticorruptionlayer.controller;

import com.example.anticorruptionlayer.model.customer.CustomerOrder;
import com.example.anticorruptionlayer.model.supplier.SupplierOrder;
import com.example.anticorruptionlayer.service.TransferService;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class AnticorruptionController {

    private final TransferService service;

    @Post("/order")
    public SupplierOrder test(@Body CustomerOrder customerOrder){
        return service.toSupplierOrder(customerOrder);
    }

}
