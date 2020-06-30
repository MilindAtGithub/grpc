package com.milind.grpc.client;

import com.google.protobuf.ByteString;
import com.milind.grpc.FileData;
import com.milind.grpc.StreamRequest;
import com.milind.grpc.UploadServiceGrpc;
import com.milind.grpc.UploadStatus;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class UploadClient {

    public static void main(String args[]) throws InterruptedException {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8090)
                .usePlaintext()
                .build();
        UploadServiceGrpc.UploadServiceStub stub = UploadServiceGrpc.newStub(channel);
        StreamObserver<FileData> collect = stub.upload(new StreamObserver<UploadStatus>() {
            @Override
            public void onNext(UploadStatus uploadStatus) {
                System.out.println(" File Upload Status :"+uploadStatus);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        });

        FileInputStream fileInputStream =null;
        try {
            fileInputStream = new FileInputStream("C://milind//temp//in//vid.mp4");
            byte byteArr[] = new byte[512];
            int content =0;
            while((content=fileInputStream.read(byteArr))!= -1){
                System.out.println(Thread.currentThread()+"- Sending File Data");
                collect.onNext(FileData.newBuilder().setContent(ByteString.copyFrom(byteArr))
                        .build());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            collect.onCompleted();
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        TimeUnit.SECONDS.sleep(50);
        channel.shutdown();
    }

}
