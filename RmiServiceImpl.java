package com.example.demo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RmiServiceImpl extends UnicastRemoteObject implements RmiService {

    protected RmiServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello(String name) throws RemoteException {
        return "Hello, " + name + "!";
    }

    @Override
    public String sayGoodbye(String name) throws RemoteException {
        return "Goodbye, " + name + "!";
    }

    @Override
    public boolean authenticate(String username, String password) throws RemoteException {
        // Simple authentication logic (replace with real authentication)
        return "user".equals(username) && "password".equals(password);
    }
}
