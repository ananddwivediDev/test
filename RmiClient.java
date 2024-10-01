package com.example.demo;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiClient {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            RmiService rmiService = (RmiService) registry.lookup("RmiService");
            String response = rmiService.sayHello("World");
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
