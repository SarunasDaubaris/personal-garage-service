package com.personalgarage.service.api.domain.cars.application.services;

import com.personalgarage.service.api.domain.cars.application.components.CarServiceModelMapper;
import com.personalgarage.service.api.domain.cars.data.dtos.CarDTO;
import com.personalgarage.service.api.domain.cars.persistence.entities.Car;
import com.personalgarage.service.api.domain.cars.persistence.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private CarServiceModelMapper carServiceModelMapper;
    private CarRepository carRepository;

    public CarService() {
    }

    @Autowired
    public CarService(CarServiceModelMapper carServiceModelMapper, CarRepository carRepository) {
        this.carServiceModelMapper = carServiceModelMapper;
        this.carRepository = carRepository;
    }

    public CarDTO get(Long id) {
        return carServiceModelMapper.mapByClass(carRepository.findOne(id), CarDTO.class);
    }

    public List<CarDTO> getAllByUser(Long userId) {
        return carServiceModelMapper.mapToListByClass(carRepository.findByUserId(userId), CarDTO.class);
    }

    public CarDTO insert(CarDTO carDTO) {
        Car car = carServiceModelMapper.mapByClass(carDTO, Car.class);
        return carServiceModelMapper.mapByClass(carRepository.save(car), CarDTO.class);
    }

    public CarDTO update(CarDTO carDTO) {
        Car car = carServiceModelMapper.mapByClass(carDTO, Car.class);
        return carServiceModelMapper.mapByClass(carRepository.save(car), CarDTO.class);
    }
}