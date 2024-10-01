package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

import java.rmi.RemoteException;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) throws RemoteException {
        HelloWorldRMI helloWorldRMI = SpringApplication.run(DemoApplication.class, args)
                .getBean(HelloWorldRMI.class);

        System.out.println("================RMI Client Invocation ========================");

        if (helloWorldRMI.authenticate("user", "password")) {
            System.out.println(helloWorldRMI.sayHelloRmi("Bharti"));
        } else {
            System.out.println("================= You are not allowed to perform this 401 =======================");
        }
    }

    @Bean
    RmiProxyFactoryBean rmiProxy() {
        RmiProxyFactoryBean bean = new RmiProxyFactoryBean();
        bean.setServiceInterface(HelloWorldRMI.class);
        bean.setServiceUrl("rmi://localhost:1099/helloworldrmi");

        return bean;
    }
}
