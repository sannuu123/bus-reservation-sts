package com.lti.app.dao;

import java.util.List;

import com.lti.app.pojo.Vehicle;

public interface VehicleDAO
{
	public boolean addVehicle(Vehicle vehicle);
	public List<Vehicle> getVehicles();

}
