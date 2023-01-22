package com.app.CarInformation.entity;

import javax.persistence.*;




@Entity
@Table(name = "cars")
public class Car {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;


		@Column(name = "condition")
	    private String condition;

	    @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "details_id", referencedColumnName = "id")
	    private CarDetails details;

	    @OneToOne(cascade = CascadeType.ALL)
//	    @JoinColumn(name = "location_id", referencedColumnName = "id")
	    private Location location;

	    public Car() {
	    }

	    public Car(String condition, CarDetails details, Location location) {
	        this.condition = condition;
	        this.details = details;
	        this.location = location;
	    }
	    
	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCondition() {
			return condition;
		}

		public void setCondition(String condition) {
			this.condition = condition;
		}

		public CarDetails getDetails() {
			return details;
		}

		public void setDetails(CarDetails details) {
			this.details = details;
		}

		public Location getLocation() {
			return location;
		}

		public void setLocation(Location location) {
			this.location = location;
		}
}
