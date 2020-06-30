package com.milind.grpc.client;

import com.milind.grpc.generated.Order;
import com.milind.grpc.generated.OrderServiceGrpc;
import com.milind.grpc.generated.Shipment;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ShipmentClient {

    public static void main(String args[]) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9010)
                .usePlaintext()
                .build();

        OrderServiceGrpc.OrderServiceBlockingStub stub = OrderServiceGrpc.newBlockingStub(channel);
        Random random = new Random();
        Iterator<Order> orders = stub.getShipment(Shipment.newBuilder()
                       .setShipmentLocation(random.nextInt(9999))
                       .setGiveFragileItems(random.nextInt(1) == 0 ? true : false)
                       .build());
        while (orders.hasNext()){
            System.out.println(orders.next());
        }
        System.out.println("Received all order for the shipment ");
       channel.shutdown();
       TimeUnit.SECONDS.sleep(20);
    }

}
