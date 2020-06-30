package com.milind.grpc.client;

import com.milind.grpc.MarkServiceGrpc;
import com.milind.grpc.StreamRequest;
import com.milind.grpc.StreamResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class MarkClient {

    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8090)
                .usePlaintext()
                .build();
        MarkServiceGrpc.MarkServiceStub stub = MarkServiceGrpc.newStub(channel);
        StreamObserver<StreamRequest> collect = stub.examine(new StreamObserver<StreamResponse>() {
            public void onNext(StreamResponse streamResponse) {
                System.out.println(Thread.currentThread()+" Stream Response \n"+ streamResponse);
            }

            public void onError(Throwable throwable) {
            }

            public void onCompleted() {
            }
        });
        String name[] = {"Milind", "Muthu", "Rohit"};
        StreamRequest arr[] = new StreamRequest[4];
        for(int i=0; i< arr.length-1;i++) {
            arr[i] = StreamRequest.newBuilder().setEmpName(name[new Random().nextInt(3)])
                    .setMarks(new Random().nextInt(100)).build();
        }
        Stream.of(arr).forEach(t->{

            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            collect.onNext(t);
            System.out.println(Thread.currentThread()+" Sending");
            if(arr[3]==null){
                arr[3]=StreamRequest.newBuilder().setEmpName("Fourth")
                        .setMarks(80).build();
            }
        });
        TimeUnit.SECONDS.sleep(15);
        collect.onNext(StreamRequest.newBuilder().setEmpName("FinalEmployee")
                .setMarks(new Random().nextInt(100)).build());
        collect.onCompleted();
        TimeUnit.SECONDS.sleep(10);
    }
    }
