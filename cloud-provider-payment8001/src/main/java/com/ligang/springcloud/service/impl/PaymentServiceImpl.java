package com.ligang.springcloud.service.impl;

import com.ligang.springcloud.dao.PaymentDao;
import com.ligang.springcloud.entities.Payment;
import com.ligang.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired //spring提供
    //@Resource //jdk提供的
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
