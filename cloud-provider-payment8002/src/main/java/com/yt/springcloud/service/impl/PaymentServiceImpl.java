package com.yt.springcloud.service.impl;

import com.yt.springcloud.dao.PaymentDao;
import com.yt.springcloud.entities.Payment;
import com.yt.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yt
 * @version 1.0
 * @date 2020-10-8 17:22
 */
@Service
public class PaymentServiceImpl  implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
