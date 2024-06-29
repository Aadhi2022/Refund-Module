package com.refundservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.refundservice.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
