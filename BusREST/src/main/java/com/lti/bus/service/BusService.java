package com.lti.bus.service;

import java.util.List;

import com.lti.bus.pojo.AdminBus;
import com.lti.bus.pojo.Bus;

public interface BusService {
	public boolean addBus(Bus bus);
	public List<Bus> getBus();
	
	public List<Bus> searchBus(String ToFrom,String FromTo,String DateOfJourney);
	
}
