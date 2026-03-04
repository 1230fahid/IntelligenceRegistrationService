package com.intelligence.registration.controller;

import org.springframework.web.bind.annotation.RestController;

import com.intelligence.registration.service.service.ServiceService;

@RestController
@RequestMapping("/service")
public class ServiceController {

	private ServiceService serviceService;

	public ServiceController(ServiceService serviceService) {
		this.serviceService = serviceService;
	}
}