package com.example.anticorruptionlayer.service.adapter;

import com.example.anticorruptionlayer.model.customer.ServiceStation;
import jakarta.inject.Singleton;

@Singleton
public class ServiceStationAdapter {

    public String toService(ServiceStation serviceStation){
        return serviceStation.getServiceStationName() + " - " + serviceStation.getLocation();
    }

    public String toCustomerId(ServiceStation serviceStation){
        return serviceStation.getServiceCode();
    }
}
