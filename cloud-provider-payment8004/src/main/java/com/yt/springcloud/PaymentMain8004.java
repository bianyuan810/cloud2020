package com.yt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yt
 * @version 1.0
 * @date 2020-10-12 11:02
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8004 {

     public static void main(String[] args) {

           SpringApplication.run(PaymentMain8004.class, args);
      }

}
