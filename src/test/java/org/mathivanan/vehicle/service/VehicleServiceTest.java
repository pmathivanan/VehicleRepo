package org.mathivanan.vehicle.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.mathivanan.vehicle.Vehicle;

public class VehicleServiceTest {
	
	@Test
	public void testGetVehicle() {
		Vehicle v=new Vehicle();
		assertNotNull(v);
	}

}
