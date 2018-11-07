package com.bigera.dao;

import java.util.List;

import com.bigera.db.AirTicket;

public interface AirTicketDao {
	public void addTicket(AirTicket airTicket);
	public List<AirTicket> selectair_t(String air_port_id);
}
