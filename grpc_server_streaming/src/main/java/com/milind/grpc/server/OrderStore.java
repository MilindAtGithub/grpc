package com.milind.grpc.server;

import com.milind.grpc.generated.Item;
import com.milind.grpc.generated.Order;
import com.milind.grpc.generated.Shipment;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class OrderStore {


    public Order getOrder(Shipment shipment){

        Random random = new Random();
        int noofItems = random.nextInt(20);
        ArrayList<Item> items = new ArrayList<Item>(noofItems);
        for (int i=0; i<noofItems; i++ ){
            items.add(
                    Item.newBuilder()
                            .setPrice(9.9*random.nextInt(99))
                    .setItemDesc("Item Description : "+ UUID.randomUUID())
                    .setItemId(random.nextInt(9)).build()
            );
        }
        return  Order.newBuilder()
                .setOrderId(random.nextInt(5000))
                .setShipmentLocation(shipment.getShipmentLocation())
                .setFragileIncluded(shipment.getGiveFragileItems())
                .addAllItems(items)
                .build();

    }
}
