package com.personalgarage.service.domain.cars.persistence.repositories;

import com.personalgarage.service.base.persistence.repositories.IRepository;
import com.personalgarage.service.domain.cars.persistence.entities.Cars;

import java.util.List;

public interface CarsRepository extends IRepository<Cars, String> {

    List<Cars> findByOwner(String owner);
}