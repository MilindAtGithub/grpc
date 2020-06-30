package com.milind.grpc.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class GrpcClientSideLoadBalancing {

    public static void main(String args[]) throws InterruptedException {
        int port=args.length==0?9091:Integer.parseInt(args[0]);
        ManagedChannel channel1 = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        ManagedChannel channel2 = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        ManagedChannel channel3 = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        ManagedChannel channel4 = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        ManagedChannel channel5 = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();

        ManagedChannel pool[] = {channel1,channel2,channel3,channel4,channel5};

        ExecutorService es = Executors.newFixedThreadPool(50);
        for(int i =0; i <5000;i++){
            es.execute(new GrpcTask(pool[new Random().nextInt(5)],i));
        }
        TimeUnit.MILLISECONDS.sleep(50000);
        channel1.shutdown();
        channel2.shutdown();
        channel3.shutdown();
        channel4.shutdown();
        channel5.shutdown();
        es.shutdown();
    }
}
