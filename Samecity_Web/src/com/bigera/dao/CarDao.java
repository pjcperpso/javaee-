package com.bigera.dao;

import java.util.List;

import com.bigera.db.Car;

public interface CarDao {
	public List<Car> sel_byccid(String ccid);

}
