package com.lti.bus.service;

import java.util.List;

import com.lti.bus.pojo.AdminBus;

public interface AdminBusService {

	public boolean addAdminBus(AdminBus addbus);
	public List<AdminBus> getAdminBus();
	
	public boolean deleteAdminBus(String BusId);
}
