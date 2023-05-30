package org.PBOProject2;

import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws IOException {
        int port = 8016;
        try{
            HttpServer httpserver = HttpServer.create(new InetSocketAddress("localhost", 8016),0);
            httpserver.createContext("/", new Server());
            httpserver.setExecutor(Executors.newSingleThreadExecutor());
            httpserver.start();
            System.out.println( "Listening on port "+ port);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}


