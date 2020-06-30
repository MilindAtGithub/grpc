package com.milind.grpc.client;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.milind.grpc.ValidationRequest;
import com.milind.grpc.ValidationResponse;
import com.milind.grpc.ValidationServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class GrpcReactiveClient {
    public static void main(String[] args) throws InterruptedException {
        int port=args.length==0?9091:Integer.parseInt(args[0]);
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();

//        VaultServiceGrpc.VaultServiceStub stub1
//                = VaultServiceGrpc.newStub(channel);
//
//        stub1.validate(VaultRequest.newBuilder()
//                .setAccountName("Test123")
//                .setAccountNumber("SB783434")
//                .setRoutingNumber("R34343434")
//                .build(), new StreamObserver<VaultResponse>() {
//                public void onNext(VaultResponse vaultResponse) {
//                    System.out.println(Thread.currentThread()+"-"+ vaultResponse);
//                }
//
//                public void onError(Throwable throwable) {
//
//                }
//
//                public void onCompleted() {
//                    System.out.println(Thread.currentThread()+"-"+ "Completed");
//                }
//        });
//


        ValidationServiceGrpc.ValidationServiceFutureStub stub
                = ValidationServiceGrpc.newFutureStub(channel);

        final ListenableFuture<ValidationResponse> future = stub.validate(ValidationRequest.newBuilder()
                .setAccountName("Test123")
                .setAccountNumber("SB783434")
                .setRoutingNumber("R34343434")
                .build());

        for(int i =0; i<10; i++){
            System.out.println(Thread.currentThread()+"-"+i);
        }
        future.addListener(new Runnable() {
            public void run() {
                try {
                    System.out.println(Thread.currentThread()+"-"+ future.get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        }, MoreExecutors.newDirectExecutorService());
        TimeUnit.SECONDS.sleep(30);
        channel.shutdown();
    }
}
