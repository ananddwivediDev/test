package com.example.demo;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiClient {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            RmiService rmiService = (RmiService) registry.lookup("RmiService");

            // Authenticate
            if (rmiService.authenticate("user", "password")) {
                String responseHello = rmiService.sayHello("World");
                System.out.println(responseHello);

                String responseGoodbye = rmiService.sayGoodbye("World");
                System.out.println(responseGoodbye);
            } else {
                System.out.println("Authentication failed!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
