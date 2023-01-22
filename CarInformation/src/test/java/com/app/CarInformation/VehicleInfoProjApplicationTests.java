package com.app.CarInformation;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.CarInformation.dao.CarRepository;
import com.app.CarInformation.entity.Car;
import com.app.CarInformation.sevice.CarService;

@SpringBootTest
class VehicleInfoProjApplicationTests {

	@Autowired
	private CarRepository carRepository;

	@Autowired
	private CarService carService;

	@Test
	public void testGetCar() {
		Car car = new Car();
		car.setId(1L);
		car.setCondition("USED");
		Optional<Car> car1 = carRepository.findById(1L);
		Car result = car1.orElse(null);
//	        Car result1 = carService.getCar(1L);
		assertEquals(car, result);
	}

	@Test
	void contextLoads() {
	}

}
