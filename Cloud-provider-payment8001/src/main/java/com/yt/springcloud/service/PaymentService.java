package com.yt.springcloud.service;

import com.yt.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author yt
 * @version 1.0
 * @date 2020-10-8 17:21
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
