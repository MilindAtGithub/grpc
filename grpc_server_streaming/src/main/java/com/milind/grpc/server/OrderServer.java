package com.milind.grpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class OrderServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        int port=args.length==0?9010:Integer.parseInt(args[0]);
        Server server = ServerBuilder.forPort(port)
                .addService(new OrderServiceImpl())
                .build();
        System.out.println("Starting server...");
        server.start();
        System.out.println("Server started!");
        server.awaitTermination();

    }
}