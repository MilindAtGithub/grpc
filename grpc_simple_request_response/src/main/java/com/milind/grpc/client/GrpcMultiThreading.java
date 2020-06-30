package com.milind.grpc.client;

import com.milind.grpc.ValidationRequest;
import com.milind.grpc.ValidationResponse;
import com.milind.grpc.ValidationServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class GrpcMultiThreading {

    public static void main(String args[]) throws InterruptedException {
        int port=args.length==0?9091:Integer.parseInt(args[0]);
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        ExecutorService es = Executors.newFixedThreadPool(50);
        for(int i =0; i <5000;i++){
            es.execute(new GrpcTask(channel,i));
        }
        TimeUnit.MILLISECONDS.sleep(50000);
        channel.shutdown();
        es.shutdown();
    }
}

class GrpcTask implements Runnable {
    ManagedChannel channel;
    int reqNo;
    public GrpcTask(ManagedChannel channel,int reqNo) {
        this.channel = channel;
        this.reqNo = reqNo;
    }


    public void run() {
        ValidationServiceGrpc.ValidationServiceBlockingStub stub
                = ValidationServiceGrpc.newBlockingStub(channel);

        ValidationResponse vaultResponse = stub.validate(
                ValidationRequest.newBuilder()
                        .setAccountName("Test"+ new Random().nextInt())
                        .setAccountNumber("SB"+new Random().nextInt())
                        .setRoutingNumber("R"+new Random().nextInt())
                        .build());

        System.out.println("Response received from server Req No"+reqNo+" Thread: "
                +Thread.currentThread()+ "\n"
                + vaultResponse);
    }
}