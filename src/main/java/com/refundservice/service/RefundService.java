package com.refundservice.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.refundservice.dto.RefundRequestDTO;

@Service
public class RefundService {
	private final ExecutorService executorSerive = Executors.newFixedThreadPool(5);

//Inject all the object of required class 

	public void createRefundRequest(RefundRequestDTO refundRequestDTO) {
		/*
		 * Check whether the order id is present and the status is completed Save the
		 * refund request in refund table Get the payment ID for the transaction and
		 * validate refund requested is not exceeding the entire amount of transaction
		 * Find the items in the order and calculate the refund amount for returned
		 * items
		 * 
		 */
	}

//Scheduled method to process list of refund request which runs periodically
	@Scheduled
	public void processRefund() {
		/*
		 * Fetch all the return request with status initiated then process the request
		 * using thread pool for concurrent processing.
		 */
	}

}
