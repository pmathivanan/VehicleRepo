package org.mathivanan.vehicle.service;

import org.mathivanan.vehicle.bean.Vehicle;
import org.mathivanan.vehicle.database.VehicleDatabase;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleService {
	
	VehicleDatabase vehicleDatabase = new VehicleDatabase();
	
	@RequestMapping("/getVehicle")
	public Vehicle getVehicle(@RequestParam(value="vin") final String vin) throws Exception{
		
		return vehicleDatabase.getVehicle(vin);
	}
}
