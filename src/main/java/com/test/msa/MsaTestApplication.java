package com.test.msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsaTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsaTestApplication.class, args);
    }

}
