package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    public static List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("BMW", "Blue color", 3));
        carList.add(new Car("Dodge", "Black color", 55));
        carList.add(new Car("Mazda", "Red color", 15));
        carList.add(new Car("Toyota", "Brown color", 18));
        carList.add(new Car("Opel", "Grey color", 9));
    }

    @Override
    public List<Car> carsFromTheList(List<Car> carList, int count) {
        List<Car> newCarList = new ArrayList<>();
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