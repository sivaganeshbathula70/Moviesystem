package com.cg.movie.dao;

import java.util.List;

import com.cg.movie.entity.Seat;
import com.cg.movie.entity.Show;

public interface MovieDAOInterface {
	public double getPrice(int seatId);
	
	public List<Seat> reteriveu();
	public List<Show> reterive();
}
