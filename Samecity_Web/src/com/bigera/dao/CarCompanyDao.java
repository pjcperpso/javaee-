package com.bigera.dao;

import java.util.List;

import com.bigera.db.CarCompany;

public interface CarCompanyDao {
	public List<CarCompany> sel_bycity(String city);
	public List<CarCompany> selall();
}
