package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> carsFromTheList(int count) {
        List<Car> listOfCars = new ArrayList<>();
        if (count <= 0) {
            switch (count) {
                case 1:
                    listOfCars.get(0);
                    break;
                case 2:
                    listOfCars.subList(0, 2);
                    break;
                case 3:
                    listOfCars.subList(0, 3);
                    break;
                case 4:
                    listOfCars.subList(0, 4);
                default:
                    listOfCars.subList(0, listOfCars.size());
            }
        } else {
            System.out.println("Empty list");
        }
        return listOfCars;
    }
}