package com.milind.grpc.server;

import com.milind.grpc.FileData;
import com.milind.grpc.UploadServiceGrpc;
import com.milind.grpc.UploadStatus;
import com.milind.grpc.UploadStatusCode;
import io.grpc.stub.StreamObserver;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

public class UploadServiceImpl extends UploadServiceGrpc.UploadServiceImplBase {


    public StreamObserver<FileData> upload(
            StreamObserver<UploadStatus> responseObserver)  {

        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("C:\\milind\\temp\\out\\vid_received.mp4");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        FileOutputStream finalFileOutputStream = fileOutputStream;
        return new StreamObserver<FileData>() {

                @Override
                public void onNext(FileData fileData) {
                    try {
                        fileData.getContent().writeTo(finalFileOutputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                @Override
                public void onError(Throwable throwable) {

                }
                @Override
                public void onCompleted() {
                    System.out.println(Thread.currentThread()+"- Write the File");
                    try {
                        finalFileOutputStream.flush();
                        finalFileOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    responseObserver.onNext(UploadStatus.newBuilder()
                            .setCode(UploadStatusCode.Ok)
                            .setMessage("File Received and Stored Sucessfully")
                            .build());
                }
            };
        }
}
