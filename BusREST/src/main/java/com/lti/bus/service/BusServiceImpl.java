package com.lti.bus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.bus.dao.BusDAO;
import com.lti.bus.pojo.Bus;

@Service
@Transactional
public class BusServiceImpl implements BusService
{
@Autowired
BusDAO bdao;

	@Override
	public boolean addBus(Bus bus) {
		// TODO Auto-generated method stub
		return bdao.addBus(bus);
	}

	@Override
	public List<Bus> getBus() {
		// TODO Auto-generated method stub
		return bdao.getBus();
	}

	@Override
	public List<Bus> searchBus( String ToFrom, String FromTo, String DateOfJourney) {
		// TODO Auto-generated method stub
		return bdao.searchBus( ToFrom, FromTo, DateOfJourney);
	}

}
