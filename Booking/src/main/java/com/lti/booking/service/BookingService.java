package com.lti.booking.service;

import java.util.List;

import com.lti.booking.pojo.Booking;

public interface BookingService {

	public boolean addBooking(Booking booking);
	public List<Booking> getBooking();
}
