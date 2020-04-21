package com.cg.movie.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.movie.entity.Seat;
import com.cg.movie.entity.Show;
import com.cg.movie.exception.MovieBookingException;

@Repository
public class MovieDAO implements MovieDAOInterface{
	@PersistenceContext
	EntityManager entityManager;
	Seat seat=new Seat();
	

	@Override
	public double getPrice(int seatId) {
		
		Seat s1=entityManager.find(Seat.class, seatId);
		if(s1==null)
		{
			 throw new MovieBookingException("seat id is not found"+seatId);
		}
		return s1.getSeatPrice();
	}
	@Override
	public List<Seat> reteriveu() {
		String Qstr="SELECT seat FROM Seat seat";
		TypedQuery<Seat> query=entityManager.createQuery(Qstr,Seat.class);
		return query.getResultList();	
	}
	@Override
	public  List<Show> reterive()
	{
		String Qstr = "SELECT   show FROM Show show";
		TypedQuery<Show> query = entityManager.createQuery(Qstr,Show.class);
		return query.getResultList();
	}

}
