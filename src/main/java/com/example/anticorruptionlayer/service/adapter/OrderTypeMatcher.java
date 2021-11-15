package com.example.anticorruptionlayer.service.adapter;

import jakarta.inject.Singleton;

import static com.example.anticorruptionlayer.service.OrderType.REGULAR;

@Singleton
public class OrderTypeMatcher {

    public String getOrderType(){
        return REGULAR.getValue();
    }

}
