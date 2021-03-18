package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> carsFromTheList(List<Car> listOfCars, int count);
}