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
        // Here must be a call to some external subsystem, but in this example let's restrict ourselves to just returning a result of adaptation
        return service.toSupplierOrder(customerOrder);
    }

}
