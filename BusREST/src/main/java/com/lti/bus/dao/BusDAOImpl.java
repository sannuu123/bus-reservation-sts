package com.lti.bus.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.lti.bus.pojo.Bus;


@Repository
public class BusDAOImpl implements BusDAO
{
	@Autowired
	EntityManager eMan;

	@Override
	public boolean addBus(Bus bus) {
		eMan.persist(bus);
		return true;
	}

	@Override
	public List<Bus> getBus() {
		return eMan.createQuery("from Bus").getResultList();
	}

	@Override
	public List<Bus> searchBus( String ToFrom, String FromTo, String DateOfJourney) {
		Query qry2=eMan.createQuery("from Bus b where  b.ToFrom=?1 and b.FromTo=?2 and b.DateOfJourney=?3");
		
		qry2.setParameter(1,ToFrom);
		qry2.setParameter(2,FromTo);
		qry2.setParameter(3,DateOfJourney);
		List<Bus>res=qry2.getResultList();
		return res ;
		
	}

}
