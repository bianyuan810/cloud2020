package com.yt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yt
 * @version 1.0
 * @date 2020-10-12 11:51
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMain80 {
     public static void main(String[] args) {
           SpringApplication.run(OrderZKMain80.class, args);
      }
     
}
