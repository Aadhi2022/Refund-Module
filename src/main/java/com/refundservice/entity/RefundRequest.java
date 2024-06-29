package com.refundservice.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "refund_request")
public class RefundRequest {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	@ManyToOne
	@JoinColumn(name = "order_id", nullable = false)
	private Order order;

	private double refundAmt;
	private LocalDateTime refundDate;
	private String reason;
	private RefundStatus refundStatus;
	@ManyToOne
	@JoinColumn(name = "transaction_id")
	private TransactionDetails transaction;

}
