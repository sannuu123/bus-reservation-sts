package com.lti.booking.DAO;

import java.util.List;

import com.lti.booking.pojo.Booking;

public interface BookingDAO {

	public boolean addBooking(Booking booking);
	public List<Booking> getBooking();
}
