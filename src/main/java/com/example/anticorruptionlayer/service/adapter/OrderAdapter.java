package com.example.anticorruptionlayer.service.adapter;

import com.example.anticorruptionlayer.model.customer.SparePart;
import com.example.anticorruptionlayer.model.supplier.Item;
import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Singleton
public class OrderAdapter {

    public List<Item> toSupplierOrder(Map<String, List<SparePart>> sparePartsOrder) {
        List<Item> items = new ArrayList<>();
        sparePartsOrder.forEach((type, spareParts) ->
                items.addAll(spareParts.stream().map(sparePart -> toItem(type, sparePart)).collect(Collectors.toList()))
        );
        return items;
    }

    private Item toItem(String type, SparePart sparePart) {
        Item item = new Item();
        item.setType(type);
        item.setModel(sparePart.getManufacturer() + " " + sparePart.getModel());
        item.setInternalId(sparePart.getVendorCode());
        item.setQuantity(sparePart.getQuantity());
        return item;
    }
}
