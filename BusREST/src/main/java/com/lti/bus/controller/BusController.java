package com.lti.bus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.bus.pojo.Bus;
import com.lti.bus.service.BusService;

@RestController
@RequestMapping("/rest/api/")
@CrossOrigin("http://localhost:4200")
public class BusController 
{
	@Autowired
	BusService bService;
	
	@GetMapping("/bus")
	public List<Bus> getBus()
	{
		return bService.getBus();
	}
	@PostMapping("/bus")
	public boolean addBus(@RequestBody Bus bus)
	{
		return bService.addBus(bus);
	}
	@GetMapping("/bus/{ToFrom}/{FromTo}/{DateOfJourney}")
	public List<Bus> searchBus(@PathVariable("ToFrom") String ToFrom,@PathVariable("FromTo")String FromTo,@PathVariable("DateOfJourney")String DateOfJourney)
	{
		return bService.searchBus( ToFrom, FromTo, DateOfJourney);
		
	}
	
	
	

	}



