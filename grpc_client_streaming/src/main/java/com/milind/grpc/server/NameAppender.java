package com.milind.grpc.server;

public class NameAppender {

    public static String nameAppender(String name, String appendTo){
        return  appendTo==null?name:name+"-"+appendTo;
    }
}
