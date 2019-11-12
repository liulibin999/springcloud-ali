package com.ali;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AliEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AliEurekaApplication.class, args);
    }

}
