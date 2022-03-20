package com.lti.booking.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.booking.DAO.BookingDAO;
import com.lti.booking.pojo.Booking;

@Service
@Transactional
public class BookingServiceImpl implements BookingService {
@Autowired
BookingDAO bdao;

	@Override
	public boolean addBooking(Booking booking) {
		return bdao.addBooking(booking);
	}

	@Override
	public List<Booking> getBooking() {
		return bdao.getBooking();
	}

}
