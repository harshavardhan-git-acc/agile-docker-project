package com.demo;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello, Harshavardhan! The Pipeline is Alive.");
        // Keep the app running so the container doesn't exit
        Thread.currentThread().join(); 
    }
}