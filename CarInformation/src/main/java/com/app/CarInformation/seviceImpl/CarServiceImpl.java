package com.app.CarInformation.seviceImpl;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.CarInformation.dao.CarRepository;
import com.app.CarInformation.entity.Car;
import com.app.CarInformation.exceptions.CarNotFoundException;
import com.app.CarInformation.sevice.CarService;

@Service
public class CarServiceImpl implements CarService{
	
    @Autowired
    private CarRepository carRepository;

    @Override
    public Car createCar(Car car) {
        return carRepository.save(car);
    }
    
    @Override
    public Car getCar(Long id) {
    	 Optional<Car> car = carRepository.findById(id);
 //   	    return car.orElse(null);
        return car.orElseThrow(() -> new CarNotFoundException("Car with id " + id + " not found."));
    }

    @Override
    public Car updateCar(Long id, Car car) {
    	car.setId(id);
    	return carRepository.save(car);
    	}
    @Override
    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
    
}
