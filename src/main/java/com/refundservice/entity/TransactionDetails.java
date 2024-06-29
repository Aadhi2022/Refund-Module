package com.refundservice.entity;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "transaction_details")
public class TransactionDetails {
	@Id
	private Long transactionId;
	@ManyToOne
	@JoinColumn(name = "orderId")
	private Order order;
	private Date transactionDate;
	private TransactionStatus transactionStatus;
	private double amount;
	@Column(nullable = false, unique = true)
	private String paymentReferenceId;
	private TransactionType type;
	@OneToMany(mappedBy = "transaction", cascade = CascadeType.ALL)
	private List<RefundRequest> refunds;

}
