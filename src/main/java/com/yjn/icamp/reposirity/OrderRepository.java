package com.yjn.icamp.reposirity;

import com.yjn.icamp.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: yjn
 * @Date: 2018/10/6 下午3:39
 */
public interface OrderRepository extends JpaRepository<Order,Integer> {
    public Order findByOrderNumber(Long orderNumber);
}
