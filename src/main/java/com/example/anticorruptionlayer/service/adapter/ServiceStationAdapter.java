package com.example.anticorruptionlayer.service.adapter;

import com.example.anticorruptionlayer.model.customer.ServiceStation;
import org.springframework.stereotype.Service;

@Service
public class ServiceStationAdapter {

    public String toService(ServiceStation serviceStation){
        return serviceStation.getServiceStationName() + " - " + serviceStation.getLocation();
    }

    public String toCustomerId(ServiceStation serviceStation){
        return serviceStation.getServiceCode();
    }
}
