package com.example.anticorruptionlayer.service.adapter;

import org.springframework.stereotype.Service;

import static com.example.anticorruptionlayer.service.OrderType.REGULAR;

@Service
public class OrderTypeMatcher {

    public String getOrderType(){
        return REGULAR.getValue();
    }

}
