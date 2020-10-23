package com.yt.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author yt
 * @version 1.0
 * @date 2020-10-9 21:03
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
   // @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
