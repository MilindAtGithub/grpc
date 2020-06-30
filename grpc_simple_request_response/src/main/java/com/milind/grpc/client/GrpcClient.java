package com.milind.grpc.client;
import com.milind.grpc.ValidationRequest;
import com.milind.grpc.ValidationResponse;
import com.milind.grpc.ValidationServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {

    public static void main(String[] args) throws InterruptedException {
        int port=args.length==0?9091:Integer.parseInt(args[0]);
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();


        ValidationServiceGrpc.ValidationServiceBlockingStub stub
                = ValidationServiceGrpc.newBlockingStub(channel);

        ValidationResponse vaultResponse = stub.validate(
                ValidationRequest.newBuilder()
                        .setAccountName("Test123")
                        .setAccountNumber("SB783434")
                        .setRoutingNumber("R34343434")
                        .build());


        System.out.println("Response received from server:\n" + vaultResponse);
        channel.shutdown();
    }
}
