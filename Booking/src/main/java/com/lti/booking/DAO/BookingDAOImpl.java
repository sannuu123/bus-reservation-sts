package com.lti.booking.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.booking.pojo.Booking;
@Repository
public class BookingDAOImpl implements BookingDAO{

	@Autowired
	EntityManager eMan;
	
	@Override
	public boolean addBooking(Booking booking) {
		eMan.persist(booking);
		return true;
	}

	@Override
	public List<Booking> getBooking() {
		return eMan.createQuery("from Booking").getResultList();	
	}
	}


