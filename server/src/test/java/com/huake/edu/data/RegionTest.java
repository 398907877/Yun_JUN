package com.huake.edu.data;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.huake.edu.BaseSpringTest;
import com.huake.edu.entity.Location;
import com.huake.edu.service.state.StateXMLDigester;

public class RegionTest extends BaseSpringTest {

	@Autowired
	private StateXMLDigester stateXMLDigester;
	
	@Test
	public void testSAXInit(){
		Location location = stateXMLDigester.getLocation();
		System.out.println(location.getCountryRegions());
	}
}
