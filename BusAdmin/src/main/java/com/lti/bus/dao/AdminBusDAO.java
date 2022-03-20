package com.lti.bus.dao;

import java.util.List;

import com.lti.bus.pojo.AdminBus;

public interface AdminBusDAO {
	
	public boolean addAdminBus(AdminBus addbus);
	public List<AdminBus> getAdminBus();
	
	public boolean deleteAdminBus(String BusId);
}
