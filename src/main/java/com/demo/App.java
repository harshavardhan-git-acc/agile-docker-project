package com.demo;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;

public class App {
    public static void main(String[] args) throws IOException {
        // Use 8081 to avoid Jenkins 8080 conflict
        HttpServer server = HttpServer.create(new InetSocketAddress(8081), 0);
        server.createContext("/", t -> {
            byte[] response = "Pipeline Success! Hello Harshavardhan.".getBytes();
            t.sendResponseHeaders(200, response.length);
            t.getResponseBody().write(response);
            t.getResponseBody().close();
        });
        server.start();
        System.out.println("Running on 8081...");
    }
}