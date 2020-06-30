package com.milind.grpc.server;


import com.milind.grpc.ValidationRequest;
import com.milind.grpc.ValidationResponse;
import com.milind.grpc.ValidationServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.util.Random;

public class ValidationServiceImpl extends ValidationServiceGrpc.ValidationServiceImplBase {

    @Override
    public void validate(
            ValidationRequest request, StreamObserver<ValidationResponse> responseObserver) {
        System.out.println("Request received from client:\n" + request);

        int randomVal = new Random().nextInt(3);

        ValidationResponse response = ValidationResponse.newBuilder()
                .setAccountNameError(randomVal==0?"Error in Name: "+request.getAccountName():"")
                .setAccountNameError(randomVal>=0 && randomVal <=1?"Error in Account Number: "+request.getAccountNumber():"")
                .setRoutingNumberError(randomVal>=1?"Error In Rounting Number: "+request.getRoutingNumber():"")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
