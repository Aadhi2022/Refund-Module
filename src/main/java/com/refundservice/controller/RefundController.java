package com.refundservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.refundservice.dto.RefundRequestDTO;

@RestController
@RequestMapping("/refunds")
public class RefundController {
	// API List
	/*
	 * 1. Refund Request 2. Process Refund
	 */

	@PostMapping("/create")
	public void createRefundRequest(@RequestBody RefundRequestDTO refundRequestDTO) {
		// for creating a new request and calling the service method to process the
		// request
	}

	@PostMapping("/process")
	public void processRefundRequest() {
		// for processing the return request and calling the service method to process
		// the request
	}

	// We can also include APIs to list all details of refund request

}
