package com.intelligence.registration.service.user;

import com.intelligence.registration.model.dto.service.*;
import org.springframework.stereotype.Service;

@Service
public class ServiceService {
	private CreateServiceRequest createServiceRequest;
	private DeleteServiceRequest deleteServiceRequest;
	private ReadServiceRequest readServiceRequest;
	private UpdateServiceRequest updateServiceRequest;

	public ServiceService(CreateServiceRequest createServiceRequest, DeleteServiceRequest deleteServiceRequest,
			ReadServiceRequest readServiceRequest, UpdateServiceRequest updateServiceRequest) {
		this.createServiceRequest = createServiceRequest;
		this.deleteServiceRequest = deleteServiceRequest;
		this.readServiceRequest = readServiceRequest;
		this.updateServiceRequest = updateServiceRequest;
	}

}