package com.yt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yt
 * @version 1.0
 * @date 2020-10-11 15:00
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
     public static void main(String[] args) {
           SpringApplication.run(EurekaMain7001.class, args);
      }

}
