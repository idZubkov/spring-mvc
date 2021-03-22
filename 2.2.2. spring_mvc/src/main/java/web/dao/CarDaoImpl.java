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
            switch (count) {
                case 1:
                    newCarList.add(carList.get(0));
                    return newCarList;
                case 2:
                    for (int i = 0; i < 2; i++) {
                        newCarList.add(carList.get(i));
                    }
                    return newCarList;
                case 3:
                    for (int i = 0; i < 3; i++) {
                        newCarList.add(carList.get(i));
                    }
                    return newCarList;
                case 4:
                    for (int i = 0; i < 4; i++) {
                        newCarList.add(carList.get(i));
                    }
                    return newCarList;
                default:
                    newCarList.addAll(carList);
                    return newCarList;
            }
        }
        return carList;
    }
}