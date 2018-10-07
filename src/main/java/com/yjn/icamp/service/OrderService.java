package com.yjn.icamp.service;

import com.yjn.icamp.entity.Order;
import com.yjn.icamp.reposirity.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: yjn
 * @Date: 2018/10/6 下午3:44
 */
@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public Order showOrderDetail(Long orderNmber){
        return orderRepository.findByOrderNumber(orderNmber);
    }

    public Order create(Order order){
        return  orderRepository.save(order);
    }
}
