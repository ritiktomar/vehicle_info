package com.app.CarInformation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.CarInformation.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long>{

}
