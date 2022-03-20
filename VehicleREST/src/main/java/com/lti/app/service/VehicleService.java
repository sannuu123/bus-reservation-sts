package com.lti.app.service;

import java.util.List;

import com.lti.app.pojo.Vehicle;

public interface VehicleService
{
	public boolean addVehicle(Vehicle vehicle);
	public List<Vehicle> getVehicles();

}
