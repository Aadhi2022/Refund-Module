package com.refundservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.refundservice.entity.RefundRequest;

public interface RefundRepository extends JpaRepository<RefundRequest, Long> {

}
