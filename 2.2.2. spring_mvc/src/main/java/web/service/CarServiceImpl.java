package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> carsFromTheList(int count) {
        List<Car> carList = new ArrayList<>();
        List<Car> newCarList = new ArrayList<>();
        carList.add(new Car("BMW", "Blue color", 3));
        carList.add(new Car("Dodge", "Black color", 55));
        carList.add(new Car("Mazda", "Red color", 15));
        carList.add(new Car("Toyota", "Brown color", 18));
        carList.add(new Car("Opel", "Grey color", 9));

        if (count > 0 && count < 5) {
            for (int i = 0; i < count; i++) {
                newCarList.add(carList.get(i));
            }
        } else {
            newCarList.addAll(carList);
            return newCarList;
        }
        return newCarList;
    }
}