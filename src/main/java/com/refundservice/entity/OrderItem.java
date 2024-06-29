package com.refundservice.entity;

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
@Table(name = "order_items")
public class OrderItem {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	private int quantity;
	private double shippingCharge;
	private double amount;
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
}
