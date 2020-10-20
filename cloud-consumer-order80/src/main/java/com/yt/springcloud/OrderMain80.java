package com.yt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yt
 * @version 1.0
 * @date 2020-10-9 20:57
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {
     public static void main(String[] args) {
           SpringApplication.run(OrderMain80.class, args);
      }

}
