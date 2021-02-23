package com.example.providereurekaclientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProviderEurekaClientDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderEurekaClientDemoApplication.class, args);
    }

}
