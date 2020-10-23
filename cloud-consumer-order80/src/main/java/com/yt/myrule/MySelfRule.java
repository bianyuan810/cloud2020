package com.yt.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yt
 * @version 1.0
 * @date 2020-10-21 14:07
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return  new RandomRule();
    }
}
