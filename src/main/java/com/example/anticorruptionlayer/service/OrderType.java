package com.example.anticorruptionlayer.service;

public enum OrderType {
    REGULAR("Regular");

    public final String value;

    OrderType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}