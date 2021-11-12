package com.example.anticorruptionlayer.service.adapter;

import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.util.Date;

@Service
public class DateAdapter {

    private final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Date toOrderAcceptanceDate(Date customerOrderDate) {
        return new Date();
    }
}
