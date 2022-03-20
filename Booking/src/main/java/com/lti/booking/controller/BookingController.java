package com.lti.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.booking.pojo.Booking;
import com.lti.booking.service.BookingService;


@RestController
@RequestMapping("/rest/api/")
//@CrossOrigin("http://localhost:4200")
public class BookingController {

	@Autowired
	BookingService aService;
	
	@GetMapping("/abus")
	public List<Booking> getBooking()
	{
		return aService.getBooking();
	}
	@PostMapping("/abus")
	public boolean addBooking(@RequestBody Booking booking)
	{
		return aService.addBooking(booking);
	}
	
}
