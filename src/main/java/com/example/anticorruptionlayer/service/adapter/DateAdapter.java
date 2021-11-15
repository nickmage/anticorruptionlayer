package com.example.anticorruptionlayer.service.adapter;

import jakarta.inject.Singleton;

import java.util.Date;

@Singleton
public class DateAdapter {

    public Date toOrderAcceptanceDate(Date customerOrderDate) {
        return new Date();
    }
}
