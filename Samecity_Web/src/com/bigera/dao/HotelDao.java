package com.bigera.dao;

import java.util.List;

import com.bigera.db.Hotel;

public interface HotelDao {
	public List<Hotel> selall();
	public List<Hotel> selbycity(String message);

}
