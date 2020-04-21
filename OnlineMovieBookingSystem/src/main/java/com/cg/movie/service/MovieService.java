package com.cg.movie.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.movie.dao.MovieDAOInterface;
import com.cg.movie.entity.Seat;
import com.cg.movie.entity.Show;
@Service
@Transactional
public class MovieService implements MovieServiceInterface {

	
	@Autowired
	MovieDAOInterface dao;
	@Override
	public double totalCost(int seatId) {
		double seatPrice=dao.getPrice(seatId);
		double totalPrice= seatId*seatPrice;
		
		return totalPrice;
	}
	@Override
	public List<Seat> reteriveu()
	{
		List<Seat>SeatList = dao.reteriveu();
		return SeatList;
	}
	@Override
	public List<Show> reterive()
	{
		List<Show>showList = dao.reterive();
		return showList;
	}
}
