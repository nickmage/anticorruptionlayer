package com.example.anticorruptionlayer.service;

import com.example.anticorruptionlayer.model.customer.CustomerOrder;
import com.example.anticorruptionlayer.model.supplier.SupplierOrder;
import com.example.anticorruptionlayer.service.adapter.DateAdapter;
import com.example.anticorruptionlayer.service.adapter.OrderAdapter;
import com.example.anticorruptionlayer.service.adapter.OrderTypeMatcher;
import com.example.anticorruptionlayer.service.adapter.ServiceStationAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransferService {

    private final OrderAdapter orderAdapter;
    private final DateAdapter dateAdapter;
    private final OrderTypeMatcher orderTypeMatcher;
    private final ServiceStationAdapter serviceStationAdapter;

    public SupplierOrder toSupplierOrder(CustomerOrder customerOrder){
        SupplierOrder result = new SupplierOrder();
        result.setService(serviceStationAdapter.toService(customerOrder.getServiceStation()));
        result.setCustomerId(serviceStationAdapter.toCustomerId(customerOrder.getServiceStation()));
        result.setOrderType(orderTypeMatcher.getOrderType());
        result.setOrderAcceptanceDate(dateAdapter.toOrderAcceptanceDate(customerOrder.getOrderDate()));
        result.setOrder(orderAdapter.toSupplierOrder(customerOrder.getSparePartsOrder()));
        return result;
    }

}
