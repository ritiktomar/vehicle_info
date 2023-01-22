package com.app.CarInformation.entity;
import javax.persistence.*;

@Entity
@Table(name = "location")
public class Location {
	
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	
	@Column(name = "lat")
	private double lat;

	@Column(name = "long")
	private double lon;
	
	public Location(){}
	public Location(double lat, double lon) {
	    this.lat = lat;
	    this.lon = lon;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	

}
