package com.lti.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.app.dao.VehicleDAO;
import com.lti.app.pojo.Vehicle;

@Service
@Transactional
public class VechileServiceImpl implements VehicleService 
{
@Autowired
VehicleDAO vdao;

	@Override
	public boolean addVehicle(Vehicle vehicle) {
		return vdao.addVehicle(vehicle);
	}

	@Override
	public List<Vehicle> getVehicles() {
		return vdao.getVehicles();
	}

}
