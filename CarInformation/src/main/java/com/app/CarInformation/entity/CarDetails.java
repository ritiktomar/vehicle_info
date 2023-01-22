
package com.app.CarInformation.entity;

import javax.persistence.*;

@Entity
@Table(name = "car_details")
public class CarDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "body")
    private String body;
    
    @Column(name = "model")
    private String model;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "manufacturer_id", referencedColumnName = "id")
    private Manufacturer manufacturer;
    
    @Column(name = "number_of_doors")
    private int numberOfDoors;
    
    @Column(name = "fuel_type")
    private String fuelType;
    
    @Column(name = "engine")
    private String engine;
    
    @Column(name = "mileage")
    private int mileage;
    
    @Column(name = "model_year")
    private int modelYear;
    
    @Column(name = "production_year")
    private int productionYear;
    
    @Column(name = "external_color")
    private String externalColor;
    
    public CarDetails(){}
    public CarDetails(String body, String model, Manufacturer manufacturer, int numberOfDoors, String fuelType, String engine, int mileage, int modelYear, int productionYear, String externalColor) {
        this.body = body;
        this.model = model;
        this.manufacturer = manufacturer;
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
        this.engine = engine;
        this.mileage = mileage;
        this.modelYear = modelYear;
        this.productionYear = productionYear;
        this.externalColor = externalColor;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	public String getExternalColor() {
		return externalColor;
	}

	public void setExternalColor(String externalColor) {
		this.externalColor = externalColor;
	}
    
  
}
