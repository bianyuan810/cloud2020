package com.yt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yt
 * @version 1.0
 * @date 2020-10-23 14:10
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderFeignMain80 {
     public static void main(String[] args) {
           SpringApplication.run(OrderFeignMain80.class, args);
      }

}
