package com.milind.grpc.server;

import com.milind.grpc.MarkServiceGrpc;
import com.milind.grpc.StreamRequest;
import com.milind.grpc.StreamResponse;
import io.grpc.stub.StreamObserver;



public class MarkServiceImp extends MarkServiceGrpc.MarkServiceImplBase {

    public StreamObserver<StreamRequest> examine(
            final StreamObserver<StreamResponse> responseObserver) {
        return new StreamObserver<StreamRequest>() {
            String combineName=null;
            int count =0;
            int totalMarks=0;
            public void onNext(StreamRequest streamRequest) {
                combineName=NameAppender.nameAppender(streamRequest.getEmpName(),combineName);
                count++;
                totalMarks+=streamRequest.getMarks();
                System.out.println(Thread.currentThread()+"-"+System.currentTimeMillis()+ " Received Stream: "+streamRequest);
            }

            public void onError(Throwable throwable) {
                responseObserver.onError(throwable);
            }

            public void onCompleted() {
                System.out.println(Thread.currentThread()+" Complete Stream: "+Thread.currentThread());
                responseObserver.onNext(StreamResponse.newBuilder()
                        .setEmpList(combineName)
                        .setTotalEmp(count)
                        .setAverageMarks(totalMarks/count)
                        .build()
                        );

            }
        };
    }


}
