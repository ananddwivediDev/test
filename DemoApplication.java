package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner {

	@Autowired
	private RmiService rmiService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			// Create and export the RMI service
			Registry registry = LocateRegistry.createRegistry(1099);
			registry.rebind("RmiService", rmiService);
			System.out.println("RMI Server is running...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
