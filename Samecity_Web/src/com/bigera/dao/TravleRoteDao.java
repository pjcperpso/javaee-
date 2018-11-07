package com.bigera.dao;

import java.util.List;

import com.bigera.db.TravleRote;

public interface TravleRoteDao {
	public List<TravleRote> selallrote();
	public List<TravleRote> selbyname(String name);

}
