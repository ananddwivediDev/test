package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RmiConfig {

    @Bean
    public RmiService rmiService() throws Exception {
        return new RmiServiceImpl();
    }
}