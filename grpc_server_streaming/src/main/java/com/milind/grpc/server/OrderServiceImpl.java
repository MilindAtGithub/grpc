package com.milind.grpc.server;

import com.milind.grpc.generated.Order;
import com.milind.grpc.generated.OrderServiceGrpc;
import com.milind.grpc.generated.Shipment;
import io.grpc.stub.StreamObserver;

import java.util.Random;
import java.util.concurrent.TimeUnit;


public class OrderServiceImpl extends OrderServiceGrpc.OrderServiceImplBase {

    public void getShipment(Shipment request,
                           StreamObserver<Order> responseObserver) {
        System.out.println(Thread.currentThread()+"- Received Shipment at Server: "+request);
        // Sending Item every 2 seconds
        Random random = new Random();
        int noofOrders = random.nextInt(10);
        OrderStore orderStore = new OrderStore();
        for(int i=0; i< noofOrders; i++){
            System.out.println(Thread.currentThread()+"- Sending Order No: "+i);
            responseObserver.onNext(orderStore.getOrder(request));
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread()+"- All Order Completed ... . ");
        responseObserver.onCompleted();
    }
}
