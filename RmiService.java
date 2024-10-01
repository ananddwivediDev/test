package com.example.demo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RmiService extends Remote {
    String sayHello(String name) throws RemoteException;
    String sayGoodbye(String name) throws RemoteException;
    boolean authenticate(String username, String password) throws RemoteException;
}
