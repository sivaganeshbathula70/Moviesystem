package com.cg.movie.entity;



import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="lpu_movie_show")
public class Show {
	@Id
	@Column(name="show_id")
	private int showId;
	@Column(name="show_name", length=25)
	private String showName;
	@Column(name="seats")
	private int seats;
	@Column(name="show_starttime")
	private LocalDateTime showstartTime;
	@Column(name="show_endtime")
	private LocalDateTime showendtime;
		
	public LocalDateTime getShowstartTime() {
		return showstartTime;
	}

	public void setShowstartTime(LocalDateTime showstartTime) {
		this.showstartTime = showstartTime;
	}

	public LocalDateTime getShowendtime() {
		return showendtime;
	}

	public void setShowendtime(LocalDateTime showendtime) {
		this.showendtime = showendtime;
	}

	@Column(name="screen_name", length=25)
	private String screenName;
	
	@ManyToOne
	@JoinColumn(name="movie_id")
	private Movie movie;
	
	
	
	@ManyToOne
	@JoinColumn(name="theaterId", referencedColumnName = "theaterId")
	private Theater theater;

	
	public Theater getTheater() {
		return theater;
	}

	public void setTheater(Theater theater) {
		this.theater = theater;
	}

	

	

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

		
	
	

}
