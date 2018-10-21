package org.mathivanan.vehicle.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.mathivanan.vehicle.bean.Vehicle;

public class VehicleServiceTest {
	
	@Test
	public void testGetVehicle() throws Exception {
		Vehicle v=new VehicleService().getVehicle("MABCDEFGHIJKLMN01");
		assertNotNull(v);
		assertEquals(2019, v.getModelYear());
	}

}
