package com.example.providereurekaclientdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lvhonglei
 */
@RestController
public class ProviderEurekaClientController {

    @GetMapping(value = "/eureka-client")
    public String eurekaClient(){
        return "This is Eureka client ONE";
    }
}
