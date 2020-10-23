package com.yt.springcloud.controller;

import com.yt.springcloud.entities.CommonResult;
import com.yt.springcloud.entities.Payment;
import com.yt.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yt
 * @version 1.0
 * @date 2020-10-23 14:17
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){

        return  paymentFeignService.getPaymentById(id);


    }

}
