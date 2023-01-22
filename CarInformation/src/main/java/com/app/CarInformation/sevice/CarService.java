package com.app.CarInformation.sevice;

import org.springframework.stereotype.Service;

import com.app.CarInformation.entity.Car;


@Service
public interface CarService {

	public Car createCar(Car car);

    public Car getCar(Long id);
    
    public Car updateCar(Long id, Car car);
    
    public void deleteCar(Long id);
}
