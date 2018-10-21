package org.mathivanan.vehicle.service;

import org.mathivanan.vehicle.Vehicle;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleService {
	
	@RequestMapping("/")
	public Vehicle getVehicle() {
		return null;
	}

}
