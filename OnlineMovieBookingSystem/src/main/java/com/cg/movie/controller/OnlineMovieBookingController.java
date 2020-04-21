package com.cg.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.movie.entity.Seat;
import com.cg.movie.entity.Show;
import com.cg.movie.service.MovieServiceInterface;

@RestController
public class OnlineMovieBookingController {
	@Autowired
	MovieServiceInterface service;
	
	@GetMapping("/seatfare/{seatId}")
	public ResponseEntity<String> calculateFare(@PathVariable("seatId") int seatId)
	{
		double totalFare=service.totalCost(seatId);
		String statement="total cost"+totalFare;
		return new ResponseEntity<String>(statement,HttpStatus.OK);
	}
	@GetMapping("/getseat")
    public ResponseEntity<List<Seat>> getSeatlist() {
			List<Seat> list = service.reteriveu();
			return new ResponseEntity<List<Seat>>(list,HttpStatus.OK);
	}
	@GetMapping("/getshow")
	public ResponseEntity<List<Show>> getShowList() 
	{
		List<Show>list1 = service.reterive();
		return new ResponseEntity<List<Show>>(list1,HttpStatus.OK);
	}
}
